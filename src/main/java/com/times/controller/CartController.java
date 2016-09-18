package com.times.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.CartDAO;
import com.times.dao.ProductDAO;
import com.times.model.Cart;
import com.times.model.Product;

@Controller

public class CartController {

	@Autowired
	CartDAO dao1;
	
	@Autowired
	ProductDAO dao;
	@RequestMapping(value="/checkout",method = RequestMethod.GET)
	public String checkout() 
	{
		return "checkout";
	}
	
	
	@RequestMapping(value="/cart",method = RequestMethod.GET)
	public String showcart(Model M,HttpSession session) 
	{
		List<Cart> cartobj=(ArrayList<Cart>)session.getAttribute("mycart");
		Gson g=new Gson();
		String l=g.toJson(cartobj);
		M.addAttribute("cart", l);
		return "cart";
	}

	@RequestMapping(value="/addcart",method = RequestMethod.GET)
	public String addCart(@RequestParam("adpid")String id,HttpSession session,Model M) 
	{
		Product p=dao.showProduct(id);
		Cart c=new Cart();
		c.setProductId(p.getProductId());
		c.setProductName(p.getProductName());
		c.setPrice(p.getPrice());
		c.setQuantity(1);
		c.setTotal(p.getPrice());
		List<Cart> cartobj=(ArrayList<Cart>)session.getAttribute("mycart");
		cartobj.add(c);
		Gson g=new Gson();
		String l=g.toJson(cartobj);
		session.setAttribute("mycart", cartobj);
		M.addAttribute("cart", l);
		return "cart";
	}
	
	
	@RequestMapping(value="/removeitem",method = RequestMethod.GET)
	public ModelAndView removeCart(@RequestParam("pid") String id,HttpSession session) 
	{
		List<Cart> ld=(ArrayList<Cart>)session.getAttribute("mycart");
		ListIterator<Cart> lit=(ListIterator<Cart>) ld.listIterator();
		while(lit.hasNext())
		{
		Cart d=lit.next();
		if(d.getProductId()==id)
		{
		ld.remove(ld.indexOf(d));
		break;
		}
		}
		session.setAttribute("mycart",ld);
		ModelAndView mv = new ModelAndView("cart", "cart", new Cart());
		Gson gsonli = new Gson();
		String gs = gsonli.toJson(ld);
		mv.addObject("cart",gs);
		return mv;
	}

}

package com.times.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.times.dao.ProductDAO;
@Controller
public class ProductController {

	@Autowired
	ProductDAO prod;
	
	@RequestMapping("/product")
	public String showproduct(Model m)
	{
		String list=prod.disp_product();
		//m.addAttribute("list",list);
		m.addAttribute("list",list);
		return "product";
		//List<Product> list=prod.disp_product();
		//return new ModelAndView("product","list",list);
		
	}
	


}

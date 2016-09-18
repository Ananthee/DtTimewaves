package com.times.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.SupplierDAO;
import com.times.model.Category;
import com.times.model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDAO sdao;
	
	public String getdata()
	{
		ArrayList list=(ArrayList)sdao.showSupplier();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		return jsonInString;
	}
	
	// INSERT INTO DATABASE
	@RequestMapping(value="/addSupplier",method=RequestMethod.GET)
	public ModelAndView showSupplier(Model m)
	{
		ModelAndView mv=new ModelAndView("addSupplier","supplier",new Supplier());
		return mv;		
	}
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public ModelAndView  addSupplier(Supplier supplier,Model m)
	{
		
		//System.out.println(supplier.getSupplierId());
		sdao.addSupplier(supplier);
		m.addAttribute("list", getdata());
		ModelAndView mv=new ModelAndView("viewSupplier","supplier",new Supplier());
		return mv;
			
	}
	
	// VIEW THE DATAS IN H2 DB
	@RequestMapping(value="/viewSupplier",method=RequestMethod.GET)
	public ModelAndView viewSupplier(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewSupplier","supplier",new Supplier());
		return mv;
	}
	
	
	//EDIT VALUES FROM H2 DATABASE
	@RequestMapping(value="/editSupplier",method=RequestMethod.GET)
	public ModelAndView editSupplier(@RequestParam("Id")String supplierId,Model m)
	{
		
		Supplier s=sdao.viewSupplier(supplierId);
		m.addAttribute("Supplier",s);
		ModelAndView mv=new ModelAndView("editSupplier","supplier",s);
		return mv;
	}
	
	@RequestMapping(value="/editSupplier",method=RequestMethod.POST)
	public ModelAndView editSupplier(Supplier supplier,Model m)
	{
		System.out.println(supplier.getSupplierId());
	    System.out.println(supplier.getSupplierName());
		sdao.editSupplier(supplier);
		m.addAttribute("list", getdata());
		System.out.println("Added to database");
		ModelAndView mv=new ModelAndView("viewSupplier","supplier",new Supplier());
		return mv; 
		
	}
	
	// DELETE VALUES FROM H2 DATABASE
	@RequestMapping(value="/delSupplier",method=RequestMethod.GET)
	public ModelAndView delSupplier(@RequestParam("Id")String supplierId,Model m)
	{
		sdao.delSupplier(supplierId);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("viewSupplier","showSupplier",new Supplier());
		return mv;
		
	}
	


}


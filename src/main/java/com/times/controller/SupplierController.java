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
		ArrayList list=(ArrayList) sdao.showSupplier();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		return jsonInString;
	}
	
	// INSERT INTO DATABASE
	@RequestMapping(value="/addSupplier",method=RequestMethod.GET)
	public ModelAndView addSupplier(Model m)
	{
		ModelAndView mv=new ModelAndView("addSupplier","supplier",new Supplier());
		return mv;		
	}
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public String addSupplier(Supplier supplier,Model m)
	{
		
		//System.out.println(supplier.getSupplierId());
		sdao.addSupplier(supplier);
		m.addAttribute("list", getdata());
		System.out.print("Added successfully");
		return "viewSupplier";
		
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
	public ModelAndView editSupplier(@RequestParam("supplierId")String sid,Model m)
	{
		ModelAndView mv=new ModelAndView("editSupplier","supplier",new Supplier());
		return mv;
	}
	
	@RequestMapping(value="/editSupplier",method=RequestMethod.POST)
	public String editSupplier(Supplier supplier,Model m)
	{
		System.out.println(supplier.getSupplierId());
	    System.out.println(supplier.getSupplierName());
		
		//sdao.editSupplier(supplier);
		System.out.println("Added to database");
		return "editSupplier"; 
		
	}
	
	// DELETE VALUES FROM H2 DATABASE
	@RequestMapping(value="/delSupplier",method=RequestMethod.GET)
	public String delSupplier(@RequestParam("supplierId")String sid,Model m)
	{
		sdao.delSupplier(sid);
		m.addAttribute("list",getdata());
		return "viewSupplier";
	}
	


}

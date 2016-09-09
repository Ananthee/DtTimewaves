package com.times.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.SupplierDAO;
import com.times.model.Category;
import com.times.model.Supplier;

@Controller
public class SupplierController {
	@Autowired
	SupplierDAO sdao;
	// INSERT INTO DATABASE
	/*public String getdata()
	{
		ArrayList list=(ArrayList) sdao.showSupplier();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		return jsonInString;
	}
	*/
	
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
		return "addSupplier";
		
	}

}

package com.times.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.CategoryDAO;
//import com.times.dao.SupplierDAO;
import com.times.model.Category;
//import com.times.model.Supplier;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO cdao;
	
	public String getdata()
	{
		ArrayList list=(ArrayList) cdao.displayCategory();
		Gson gson = new Gson();
		String jsonInString = gson.toJson(list);
		return jsonInString;
	}
	
	// INSERT INTO DATABASE
	@RequestMapping(value="addCategory",method=RequestMethod.GET)
	public ModelAndView addCategory(Model m)
	{
		ModelAndView mv=new ModelAndView("addCategory","category",new Category());
		return mv;		
	}
	
	@RequestMapping(value="addCategory",method=RequestMethod.POST)
	public String addCategory(Category category,Model m)
	{
		
		//System.out.println(category.getCategoryId());
		cdao.addCategory(category);
		m.addAttribute("list", getdata());
		System.out.print("Added successfully");
		return "DisplayCategory";
		
	}
	
	// VIEW THE DATAS IN H2 DB
	@RequestMapping(value="viewCategory",method=RequestMethod.GET)
	public ModelAndView viewCategory(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("DisplayCategory","category",new Category());
		return mv;
	}
	
	//EDIT VALUES FROM H2 DATABASE
	@RequestMapping(value="editCategory",method=RequestMethod.GET)
	public ModelAndView editCategory(@RequestParam("categoryId")String cid,Model m)
	{
			
		//Category s=cdao.editCategory(cid);
		//m.addAttribute("Category",s);
		ModelAndView mv=new ModelAndView("Category","category",new Category());
		return mv; // will go to product jsp
			
	}
	
	@RequestMapping(value="editCategory",method=RequestMethod.POST)
	public String editCategory(Category category,Model m)
	{
		System.out.println(category.getCategoryId());
	    System.out.println(category.getCategoryName());
		//System.out.println("Added to database");
		cdao.editCategory(category);
		return "editCategory";
	}
	
		
	// DELETE VALUES FROM H2 DATABASE
	@RequestMapping(value="delCategory",method=RequestMethod.GET)
	public String delCategory(@RequestParam("categoryId")String cid,Model m)
	{
		cdao.delCategory(cid);
		m.addAttribute("list",getdata());
		return "DisplayCategory";
	}

	// DISPLAYS VALUES FROM H2 DATABASE
	@RequestMapping(value="DisplayCategory",method=RequestMethod.GET)
	public String getCategory(Model m)
	{
		m.addAttribute("list", getdata());
		return "DisplayCategory";
	}
	
	
	
}

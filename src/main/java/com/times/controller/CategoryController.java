package com.times.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.CategoryDAO;
import com.times.model.Category;

import java.util.*;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryDAO cdao;
			
	// INSERT INTO DATABASE
	
	@RequestMapping(value="/addCategory",method=RequestMethod.GET)
	public ModelAndView addCategory(Model m)
	{
		ModelAndView mv=new ModelAndView("addCategory","category",new Category());
		return mv;		
	}
		
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(Category category,Model m)
	{
		
		// System.out.println(category.getCategoryId());
		cdao.addCategory(category);
		return "addCategory";
		
	}
	
	// DISPLAY THE DATAS STORED IN DATABASE
	
	@RequestMapping(value="/DisplayCategory",method=RequestMethod.GET)
	public String DisplayCategory(Model m)
	{
		  
	  List list=cdao.displayCategory();
	  m.addAttribute("list",list);
	  //ModelAndView mv=new ModelAndView("DisplayCategory","cate",new Category());
	  return "DisplayCategory";
	
	} 
	
	// DELETE DATAS IN DATABASE
	/*@RequestMapping(value="/delCategory",method=RequestMethod.GET)
	public ModelAndView delCategory(@RequestParam("categoryId")int id,Model m)
	{
		cdao.delCategory(id);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("category","category",new Category());
		return mv;
	}*/
	
}

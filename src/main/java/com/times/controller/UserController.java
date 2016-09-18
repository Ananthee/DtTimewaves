package com.times.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.times.model.Category;

import com.google.gson.Gson;
import com.times.dao.UserDAO;
import com.times.model.Category;
import com.times.model.User;

@Controller

public class UserController {
@Autowired
UserDAO udao;

public String getdata()
{
	ArrayList list=(ArrayList) udao.displayUser();
	Gson gson = new Gson();
	String jsonInString = gson.toJson(list);
	return jsonInString;
}

// INSERT INTO DATABASE
	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public ModelAndView addUser(Model m)
	{
		ModelAndView mv=new ModelAndView("addUser","user",new User());
		return mv;		
	}
	
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(User user,Model m)
	{
		
		//System.out.println(user.getUserId());
		udao.addUser(user);
		m.addAttribute("list", getdata());
		System.out.print("Added successfully");
		return "viewUser";
		
	}
	
	// VIEW THE DATAS IN H2 DB

	@RequestMapping(value="/viewUser",method=RequestMethod.GET)
	public ModelAndView viewUser(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("DisplayUser","user",new User());
	    return mv;
    }
	
	//EDIT VALUES FROM H2 DATABASE
	@RequestMapping(value="/editUser",method=RequestMethod.GET)
	public ModelAndView editUser(@RequestParam("userId")String uid,Model m)
	{
				
		//User s=udao.editUser(uid);
		//m.addAttribute("User",s);
		ModelAndView mv=new ModelAndView("User","user",new User());
		return mv; // will go to product jsp
				
	}
	
	@RequestMapping(value="/editUser",method=RequestMethod.POST)
	public String editUser(User user,Model m)
	{
		System.out.println(user.getUserId());
	    System.out.println(user.getCustomerName());
		//System.out.println("Added to database");
		udao.editUser(user);
		return "editUser";
	}

	
	// DELETE VALUES FROM H2 DATABASE
	@RequestMapping(value="/delUser",method=RequestMethod.GET)
	public String delUser(@RequestParam("userId")String uid,Model m)
	{
		udao.delUser(uid);
		m.addAttribute("list",getdata());
		return "viewUser";
	}
}


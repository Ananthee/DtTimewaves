package com.times.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.times.dao.ProductDAO;
import com.times.dao.RegisterDAO;
import com.times.model.LoginCredentials;
import com.times.model.Product;
import com.times.model.RegisterDetails;


@Controller
public class MyController 
{
	
@Autowired
ProductDAO pdao;
	
@RequestMapping("/Home")
public String showHome()
{
	return "Home"; 
}

@RequestMapping("/AboutUs")
public String showAboutUs()
{
	return "AboutUs"; 
}
@SuppressWarnings("unchecked")
@RequestMapping("/productPage")
public String showproductPage(Model m)
{
	ArrayList<Product> list=(ArrayList<Product>)pdao.showProduct();
	Gson gson = new Gson();
	String jsonInString = gson.toJson(list);
	m.addAttribute("list",jsonInString);
	return "productPage"; 
}
@RequestMapping("/Contact")
public String showContactUs()
{
	return "Contact"; 
}

@RequestMapping("/AdminHeader")
public String showAdmin()
{
	return "AdminHeader";
}

}

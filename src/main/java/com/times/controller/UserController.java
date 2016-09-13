package com.times.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*import com.google.gson.Gson;
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

@RequestMapping(value="/viewUser",method=RequestMethod.GET)
public ModelAndView viewUser(Model m)
{
	m.addAttribute("list",getdata());
	ModelAndView mv=new ModelAndView("DisplayUser","user",new User());
	return mv;
}

}
*/

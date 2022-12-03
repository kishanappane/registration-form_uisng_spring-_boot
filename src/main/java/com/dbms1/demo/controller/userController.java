package com.dbms1.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbms1.demo.controller.bean.user;
import com.dbms1.demo.service.userService;

@Controller
public class userController {
	@Autowired
	userService UserService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	@RequestMapping(value="/login",method= RequestMethod.POST)
	public String welcomPage(ModelMap model,@RequestParam String userId,@RequestParam String password)
	{
		user User=UserService.getUserByUserId(userId);
		
		if(User.getPassword().equals(password))
		{
				model.put("userId", userId);
				return "welcome";
			
		}
		model.put("errormsg", "Please provide correct userid and password");
		return "login";
	}
	
	
	
}


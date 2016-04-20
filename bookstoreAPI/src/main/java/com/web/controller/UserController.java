package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.UserModel;
import com.web.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
//	Testing purpose
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(UserModel user)
	{
		userService.addUser(user);
	}
}

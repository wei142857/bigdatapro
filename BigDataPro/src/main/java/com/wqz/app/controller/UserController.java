package com.wqz.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wqz.app.entity.User;
import com.wqz.app.service.userservice.UserService;

@Controller
@RequestMapping("user/")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("login")
	@ResponseBody
	public String login(User user) {
		service.saveUser(user);
		return user.toString();
	}
	
}

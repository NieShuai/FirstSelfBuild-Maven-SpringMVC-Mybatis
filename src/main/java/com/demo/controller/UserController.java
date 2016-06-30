package com.demo.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@SuppressWarnings("rawtypes")
	@RequestMapping("/getUser")
	public @ResponseBody List<Map> getUser(HttpServletRequest request) {
		List<Map> userList = this.userService.getUser();
		return userList;
	}
}

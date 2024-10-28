package com.peisia.spring.mi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peisia.dto.UserDto;
import com.peisia.spring.mi.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/user/*")
@AllArgsConstructor
public class UserController {

	private UserService userService;

	@GetMapping("/register")
	public void register() {

	}

	@GetMapping("/registerProc")
	public String registerProc(UserDto user) {
		log.info("등록입니다=====================" + user.getUserName());
		userService.register(user);
		return "/home";

	}

}
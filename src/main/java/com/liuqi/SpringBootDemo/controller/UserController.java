package com.liuqi.SpringBootDemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RequestMapping("user/")
@RestController
public class UserController {

	@RequestMapping("login")
	public String longin() {
		return "Hello World";
	}
}

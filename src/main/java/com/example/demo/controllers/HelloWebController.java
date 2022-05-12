package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {
	@RequestMapping("/web")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "this is a custom message. Hello from Bridgelabz");
		return "message";
	}
}
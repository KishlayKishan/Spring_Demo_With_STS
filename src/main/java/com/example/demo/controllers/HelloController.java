package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/hello")
//    @RequestMapping(method = RequestMethod.GET)

	@RequestMapping("/Kishlay_Kishan")
	public String sayHello() {
		return "hello";
	}
}
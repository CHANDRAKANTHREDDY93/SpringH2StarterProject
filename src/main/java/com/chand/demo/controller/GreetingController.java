package com.chand.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chand.demo.service.DemoService;

@RestController
public class GreetingController {
	
	@Autowired
	private DemoService demoService;
	
	
	@RequestMapping(value="/getPersons", method=RequestMethod.GET)
	public DemoService getPerson() {
		demoService.setId("11x01a05b7");
		demoService.setName("Chandrakanth Verlapally");
		demoService.setAge(24);
		demoService.setDesc("Full Stack Developer");
		return demoService;
	}
}

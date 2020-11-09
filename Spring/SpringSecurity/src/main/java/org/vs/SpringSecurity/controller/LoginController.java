package org.vs.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/sayHello")
	public String sayHello(Model themodel)
	{
		
		themodel.addAttribute("thedate", new java.util.Date());
		
		return "date";
		
	}
}

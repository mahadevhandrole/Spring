package org.vs.Thymeleafdemo.rest;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
	
	@GetMapping("sayHello")
	public String sayHello(Model themodel)
	{
		
		themodel.addAttribute("thedate", new java.util.Date());
		
		return "date";
		
	}

}

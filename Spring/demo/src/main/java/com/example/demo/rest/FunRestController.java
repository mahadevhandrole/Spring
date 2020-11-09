package com.example.demo.rest;

import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayhello(Model themodel)
	{
		themodel.addAttribute("thedate", new  java.util.Date());
		
		return" welcome back";
		
	}
}

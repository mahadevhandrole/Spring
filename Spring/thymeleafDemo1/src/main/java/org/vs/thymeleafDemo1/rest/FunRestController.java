package org.vs.thymeleafDemo1.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//@GetMapping("/hello")
	@RequestMapping(value="/display")
	public String Hello()
    {
		//Themodel.addAttribute("date", new java.util.Date());
				
	 return"index";
     }
}

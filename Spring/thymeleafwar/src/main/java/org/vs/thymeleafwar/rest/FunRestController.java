package org.vs.thymeleafwar.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/say")
	public String sayHello()
	{
		return "display";
	}
}

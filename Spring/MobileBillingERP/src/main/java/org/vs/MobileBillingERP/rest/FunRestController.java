package org.vs.MobileBillingERP.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/workout")
	public String say()
	
	{
		return " get dialy workout ";
		
	}
	
	@GetMapping("/fortune")
	public String fortune()
	{
		return " today is your lucky day";
		
	}
}

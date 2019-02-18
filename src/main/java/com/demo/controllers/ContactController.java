package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("contact")
public class ContactController {

	
	
	@RequestMapping( value="contact"  ,method  = RequestMethod.GET)
	public String index() {
		return "contact.contact";
	}
	
	

	
	
}

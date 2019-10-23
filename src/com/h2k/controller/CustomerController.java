package com.h2k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.h2k.bean.Customer;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping
	public String get() {
		
		return "customer";
	}

	@GetMapping(path = "/getForDay/{day}")
	public String getForDay(@PathVariable String day, Model model) {
		String message = "This Method accessed thru path and taken a additional Parm :: " + day;
		System.out.println( "This Method accessed thru path and taken a additional Parm :: " + day);
		model.addAttribute("message", message);
		return "customer";
	}
	
	
}

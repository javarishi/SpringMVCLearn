package com.h2k.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        // /WEB-INF/jsp/helloWorld.jsp
        return "helloWorld";
    }
}

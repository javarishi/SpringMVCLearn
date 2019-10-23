package com.h2k.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	public static final String STATUS_MESSAGE = "STATUS_MESSAGE";
	
	
	@RequestMapping("/showLogin.html")
    public String showLoginPage() {
        return "show_login";
    }
	
	@RequestMapping("/doLogin")
 	public String doLogin(Model model, 
    		@ModelAttribute("userName") String userName, 
    		@ModelAttribute("password") String password) {
        System.out.println("userName = " + userName + "  password = " + password) ;
        
        
        boolean checkResult = false;
        if(userName != null && userName.trim().length() > 0 
        		&& password != null && password.trim().length() > 0) {
        	if(userName.equals(password)) {
        		checkResult = true;
        	}
        }
  
        if(checkResult) {
            model.addAttribute(STATUS_MESSAGE, "User account is correct. ");
            return "login_success";
        }else
        {
            model.addAttribute(STATUS_MESSAGE, "User account is not correct. ");
            return "show_login";
        }
    }
}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.bean.LoginBean;
import com.service.LoginService;



@Controller
public class LoginController {
    
    @ModelAttribute("login")
    public LoginBean loginBean() {
        return new LoginBean();
    }
    
    @Autowired
    private LoginService service;
    
	
	
	
    @RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginpage(@ModelAttribute("login") LoginBean login) {
	      
	    return "login";

	}


	@RequestMapping(value="/submitlogin", method=RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean login, 
			BindingResult result) {
			    boolean isvalidate=service.validate(login);
			    
			    
			    if(isvalidate)
			    {
			        return "success";
			    }
			    else
			    {
			    
			    return "invalid";
			    }
			    
			    
			   
	}
	

}

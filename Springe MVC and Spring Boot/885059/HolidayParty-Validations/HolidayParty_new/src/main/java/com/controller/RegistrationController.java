package com.controller;
import com.model.*;
import com.validate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class RegistrationController {

    @Autowired
    private CustomValidator custValidator;
    
    @RequestMapping("/registerPage")
    public String registerPage(@ModelAttribute("register") RegistrationBean  registrationBean, BindingResult result) {
        return "registrationpage";
    }
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String performRegistration(@ModelAttribute("register") RegistrationBean  registrationBean, 
			BindingResult result) {
		custValidator.validate(registrationBean, result);
		if(result.hasErrors())
		{
		    return "registrationpage";
		}
        return "thankyou";
	}	 	  		    	    	     	      	 	
}

package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.bean.LoginBean;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginpage(@ModelAttribute("login") LoginBean loginBean) {
		return "login";

	}
//	@RequestMapping(value = "/", method = RequestMethod.GET) 
//	public String displayLogin(Model model) { 
//	    model.addAttribute("login", new LoginBean()); 
//	    return "login"; 
//	}

	@RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean, BindingResult result) {
		
		ModelMap model=null;
		boolean isValidUser = service.validate(loginBean);
// 		if (result.hasErrors()) {
// 			return "login";
// 		}
		if (!isValidUser) {
			// model.put("errorMessage", "Invalid Credentials");
			return "invalid";
		}
		model.addAttribute("name", loginBean.getUserName());
		
		//return new ModelAndView("success","userName",loginBean.getUserName());
		return "success";
		

	}

}

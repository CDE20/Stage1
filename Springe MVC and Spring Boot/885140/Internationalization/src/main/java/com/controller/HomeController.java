package com.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Customer;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/getdetails", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("customer") Customer obj) {
	
		return "home";
	}
	
	@RequestMapping(value="/success", method = RequestMethod.POST)
	public String success(@ModelAttribute("customer") Customer obj) {
		
		return "success";
	}
	

}

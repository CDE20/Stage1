package com.cognizant.bmi.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bmi.bean.User;
import com.cognizant.bmi.service.BMIService;;

@Controller
public class BMIController {
//add the code as per the requirement

	@Autowired
	BMIService service;

	@RequestMapping("/bmiForm")
	public String showBMIForm(@ModelAttribute("user") User user, ModelMap map) {
		map.addAttribute("genderType", populateGenderList());
		return "bmiCalculatorForm";
	}

	@RequestMapping("/getBMI")
	public String getBMIStatus(@ModelAttribute("user") @Valid User user, BindingResult result, ModelMap map) {

		if (result.hasErrors()) {
			map.addAttribute("genderType", populateGenderList());
			return "bmiCalculatorForm";
		}
		user = service.addUserDetails(user);
		double bmi = service.calculateBMI(user);
		String bmiStatus = service.getBMIStatus(bmi);

		map.addAttribute("user", user);
		map.addAttribute("bmi", bmi);
		map.addAttribute("status", bmiStatus);
		return "bmiStatus";
	}

	public List<String> populateGenderList() {
		return service.genderType;
	}
}
package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;

@Controller
public class CakeController {

	// add the code as per the requirement
	@Autowired
	private CakeService cakeService;
	
	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {

		return "placeOrder";
	}

	@RequestMapping(value="/orderStatus",method=RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		double price = 0;
		if(result.hasErrors())
			return "placeOrder";
		
		int orderId = cakeService.addOrder(cake);
		cake.setIncludeCandles(0);
		cake.setIncludeinscription(0);

		int flavorRate = CakeService.flavorList.get(cake.getFlavor());
		
		int selectedCake = cake.getSelectedcake();
		int includeCandles = cake.getIncludeCandles();
		int includeInscription = cake.getIncludeinscription();
		price = selectedCake + flavorRate + includeCandles + includeInscription;
		cake.setPrice(price);
		cake.setFlavorRate(flavorRate);
		double indianPrice = cake.getPrice() * 75.0;
		
        map.addAttribute("orderId", orderId);
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", indianPrice);
		map.addAttribute("date", new Date());


		if(orderId>=1000) {

			return "orderStatus";
		}
		else
			return "placeOrder";
	}
	
	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		Set<String> flavorList = new LinkedHashSet<String>();
		flavorList.add("None($0)");
		flavorList.add("Custard($5)");
		flavorList.add("Raspberry($10)");
		flavorList.add("Pineapple($5)");
		flavorList.add("Cherry($6)");
		flavorList.add("Apricot($8)");
		flavorList.add("Buttercream($7)");
		flavorList.add("Chocolate($10)");
		return flavorList;
	}

}

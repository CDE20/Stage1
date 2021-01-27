package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.Set;

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

	@Autowired
	private CakeService cakeService;

	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {

		return "placeOrder";
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		if (result.hasErrors()) {
			return "placeOrder";
		}
		int flavorRate = 0;
		if (CakeService.flavorList.containsKey(cake.getFlavor())) {
			flavorRate = CakeService.flavorList.get(cake.getFlavor());
		}
		cake.setFlavorRate(flavorRate);
		cake.setIncludeCandles(0);
		cake.setIncludeinscription(0);
		double price = 0;
		price = flavorRate + cake.getIncludeinscription() + cake.getSelectedcake() + cake.getIncludeCandles();
		cake.setPrice(price);
		double indianPrice = cake.getPrice() * 75.0;
		int orderId = cakeService.addOrder(cake);
		map.put("cake", cake);
		map.put("indianPrice", indianPrice);
		map.put("orderId", orderId);
		if (orderId >= 1000) {
			return "orderStatus";
		} else {
			return "placeOrder";
		}
	}

	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		Set<String> tempset = CakeService.flavorList.keySet();
		return tempset;
	}

}

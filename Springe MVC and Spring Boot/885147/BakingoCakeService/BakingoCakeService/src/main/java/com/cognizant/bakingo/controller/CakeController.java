package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
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

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {
		
		if (result.hasErrors()) {
			return "placeOrder";
		}
		int flavorRate = CakeService.flavorList.get(cake.getFlavor());
		cake.setFlavorRate(flavorRate);
		
		if(cake.getIncludeCandles() == null)
			cake.setIncludeCandles(0);
		
		if(cake.getIncludeinscription() == null)
			cake.setIncludeinscription(0);

		double price = cake.getSelectedcake() + cake.getFlavorRate() + cake.getIncludeCandles()
				+ cake.getIncludeinscription();
		
		cake.setPrice(price);
		
		double indianPrice = cake.getPrice() * 75.0;
		
		int orderId = cakeService.addOrder(cake);
		Date orderDate = new Date();
		
		map.addAttribute("orderId",orderId);
		map.addAttribute("orderDate",orderDate);
		map.addAttribute("cake",cake);
		map.addAttribute("indianPrice",indianPrice);
		
		if(orderId >= 1000)
			return "orderStatus";
		return "placeOrder";
	}

	@ModelAttribute("flavorList")
	public Set<String> populateFillingList() {
		Set<String> flavorList = CakeService.flavorList.keySet();
		return flavorList;
	}

}

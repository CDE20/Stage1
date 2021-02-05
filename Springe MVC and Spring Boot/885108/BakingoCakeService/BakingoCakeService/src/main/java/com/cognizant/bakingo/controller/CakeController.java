package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;

@Controller
public class CakeController {

	@Autowired
	private CakeService cakeService;

	@ModelAttribute("cake")
	public Cake modelAttribute(ModelMap map) {
		map.addAttribute("flavor", populateFillingList());
		Cake cake = new Cake();
		return cake;
	}

	// add the code as per the requirement
	@RequestMapping(value = "/showCakeOrderForm", method = RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {
		cake.setFlavor("flavor");
		return "placeOrder";
	}

	@RequestMapping(value = "/orderStatus", method = RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake, BindingResult result, ModelMap map) {

		double price = 0;

		if (result.hasErrors()) {
			return "placeOrder";
		}
		Integer orderId = cakeService.addOrder(cake);

		cake.setIncludeCandles(0);
		cake.setIncludeinscription(0);
		
		boolean containsFlavor = cakeService.flavorList.containsKey(cake.getFlavor());

		if (containsFlavor) {
			Integer flavorRate = cakeService.flavorList.get(cake.getFlavor());
			price = (double) (cake.getSelectedcake() + flavorRate + cake.getIncludeCandles()
					+ cake.getIncludeinscription());

			cake.setFlavorRate(flavorRate);
			cake.setPrice(price);
		}

		double indianPrice = cake.getPrice() * 75;

		map.addAttribute("orderId", orderId);
		map.addAttribute("cake", cake);
		map.addAttribute("indianPrice", indianPrice);
		map.addAttribute("date", new Date());

		if (orderId >= 1000) return "orderStatus";
		
		return "placeOrder";
	}

	public Set<String> populateFillingList() {
		Set<String> fillingList = new LinkedHashSet<>();

		fillingList.add("None($0)");
		fillingList.add("Custard($5)");
		fillingList.add("Raspberry($10)");
		fillingList.add("Pineapple($5)");
		fillingList.add("Cherry($6)");
		fillingList.add("Apricot($8)");
		fillingList.add("Buttercream($7)");
		fillingList.add("Chocolate($10)");

		return fillingList;
	}

}

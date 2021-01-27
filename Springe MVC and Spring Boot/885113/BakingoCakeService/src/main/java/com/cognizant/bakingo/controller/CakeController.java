package com.cognizant.bakingo.controller;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import com.cognizant.bakingo.bean.Cake;
import com.cognizant.bakingo.service.CakeService;
@Controller
public class CakeController {
	
	//add the code as per the requirement
	@Autowired
	private CakeService cakeService;
	
	
	@RequestMapping(value="/showCakeOrderForm", method=RequestMethod.GET)
	public String showCakeOrderForm(@ModelAttribute("cake") Cake cake) {
		
		return "placeOrder";
}


    @RequestMapping(value="/orderStatus", method=RequestMethod.POST)
	public String getOrderStatus(@Valid @ModelAttribute("cake") Cake cake,BindingResult result,ModelMap map) {

	
	if(result.hasErrors())
	{
		return "placeOrder";
	}
	double price=0;
	int flavorRate=0;
    /*	for(Map.Entry<String,Integer> entry : CakeService.flavorList.entrySet()){
		if(entry.getKey().equals(cake.getFlavor()))
		{
			flavorRate = entry.getValue();
		}
		}*/
		cake.setFlavorRate(CakeService.flavorList.get(cake.getFlavor()));
		if(cake.getIncludeCandles()==null)
		cake.setIncludeCandles(0);
		
		if(cake.getIncludeinscription()==null)
		cake.setIncludeinscription(0);
	
	price=cake.getSelectedcake()+cake.getFlavorRate()+cake.getIncludeCandles()+cake.getIncludeinscription();
	cake.setPrice(price);
	double indianPrice=cake.getPrice()*75.0;
	  int orderId = cakeService.addOrder(cake);
	  map.addAttribute("cake", cake);
	  map.addAttribute("indianPrice",indianPrice);
	  map.addAttribute("orderId", orderId);
	  if(orderId>=1000)
	  
		  return "orderStatus";
	  
	  else
	  
		return "placeOrder";
	  
	}
	
	



@ModelAttribute("flavorList")
public Set<String> populateFillingList(){
	Set<String> set=new LinkedHashSet<String>();
	for(Map.Entry<String,Integer> entry : CakeService.flavorList.entrySet()){
		set.add(entry.getKey());
		}
	return set;
}
	
}

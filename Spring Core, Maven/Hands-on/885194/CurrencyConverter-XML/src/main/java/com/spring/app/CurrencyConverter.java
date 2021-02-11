package com.spring.app;

import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

public class CurrencyConverter {

    private Map<String, String> mObj;
    	
    public Map<String, String> getMObj() {
		return mObj;
	}

    
	public void setMObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}
	
	@Override
	public String toString() {
	    return "CurrencyConverter[ " + mObj + "]";
	}
    	
    public int getTotalCurrencyValue(String value) {
	    
	    int amount = Integer.parseInt(value.replaceAll("[A-Za-z]", ""));
	    
	    String currency = value.replaceAll("[^A-Za-z]+", "");
	    currency = currency.toUpperCase();
	    
	    int rate = 0;
	    if (mObj.containsKey(currency))
	        rate = Integer.parseInt(mObj.get(currency));
	    
	   // System.out.println(amount + " " + currency + " " + rate);
        return rate*amount;
    }	

}

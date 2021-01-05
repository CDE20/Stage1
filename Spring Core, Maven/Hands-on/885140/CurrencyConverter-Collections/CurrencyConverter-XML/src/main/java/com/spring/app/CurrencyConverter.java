package com.spring.app;

import java.util.Map;
import java.util.Map.Entry;

public class CurrencyConverter {

	Map<String, String> mObj;

	public Map<String, String> getmObj() {
		return mObj;
	}

	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}

	public int getTotalCurrencyValue(String value) {
		
			String amount = "";
			String currency = "";
			int currencyValue = 0;
			int i = 0;
			if(value.toLowerCase().contains("dollar") || value.toLowerCase().contains("dinar") || value.toLowerCase().contains("euro")) {
				amount = value.replaceAll("[a-zA-Z]","");
				currency = value.replaceAll("[0-9]","");
			}
			for (Entry<String, String> entry : mObj.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(currency))
					currencyValue = Integer.parseInt(entry.getValue()) * Integer.parseInt(amount);
			}
		return currencyValue;

	}

}

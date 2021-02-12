package com.spring.app;

import java.util.Map;

public class CurrencyConverter {

	private Map<String, String> mObj;

	public Map<String, String> getmObj() {
		return mObj;
	}

	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}

	public int getTotalCurrencyValue(String value) {

		String numberString = value.replaceAll("\\D", "");
		int number = Integer.parseInt(numberString);

		String currency = value.replaceAll("\\d", "").toUpperCase();

		if (mObj.containsKey(currency)) {
			return number * Integer.parseInt(mObj.get(currency));
		}

		return 0;
	}

}

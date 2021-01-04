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
		char[] arr = value.toCharArray();
		int i=0;
		while(true)
		{
			if(Character.isDigit(arr[i]))
				i++;
			else
				break;
		}
		//System.out.println("Count:"+i);
		String curr = value.substring(i).toUpperCase();
		//System.out.println(curr);
		int val = 0;
		if(mObj.containsKey(curr))
		{
			val = Integer.parseInt(mObj.get(curr));
		}
		//System.out.println(val);
		return val*Integer.parseInt(value.substring(0, i));
	}

}

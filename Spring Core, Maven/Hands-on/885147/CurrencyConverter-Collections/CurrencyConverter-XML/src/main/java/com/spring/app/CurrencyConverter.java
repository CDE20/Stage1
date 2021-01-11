package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
    
        private Map<String,String> mObj;
	
	    public Map<String, String> getmObj() {
			return mObj;
		}

		public void setmObj(Map<String, String> mObj) {
			this.mObj = mObj;
		}

		@Override
		public String toString() {
			return "CurrencyConverter [mObj=" + mObj + "]";
		}

		public int getTotalCurrencyValue(String value)
    	{
			int totalCurrency = Integer.parseInt(value.replaceAll("[^0-9]", ""));
			String currencyName = value.replaceAll("[^A-Za-z]", "");
			
			currencyName = currencyName.toUpperCase();
			
			int totalRate=0;
			if(mObj.containsKey(currencyName)) {
				totalRate = Integer.parseInt(mObj.get(currencyName));	
			}
	        return totalCurrency * totalRate;
	 
	    }	
	
		    	    	     	      	 	

}

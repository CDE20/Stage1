package com.spring.app;
import java.util.Map;
import java.util.Set;

public class CurrencyConverter {
	private Map<String, String> mObj;
    
    public void setMObj(Map mObj){
        this.mObj = mObj;
    }
    
    public Map<String, String>  getMObj(){
        return mObj;
    }
    
    public int getTotalCurrencyValue(String value)
	{
	     int val = 0;
	    if(value != ""){
	    	String currency = value.toUpperCase();
	    	String currencyValue = null;
	    	Set<String> keys = mObj.keySet();
	    	for(String s : keys)
	    		if(currency.contains(s)){
	    			currencyValue = mObj.get(s);
	    			val = Integer.parseInt(currencyValue)* Integer.parseInt(currency.replace(s, ""));
	    			break;
	    		}
	    }
        return val;
	}
}

package com.spring.app;

import java.util.*;

public class CurrencyConverter {
	    
	    private Map<String,String> mObj;
	    
	    public Map<String,String> getMObj(){
	        return mObj;
	    }
	    
	    public void setMObj(Map<String,String> mObj){
	        this.mObj = mObj;
	    }
	    
	    public int getTotalCurrencyValue(String value)
    	{   
    	    String str=value;
		   int num= Integer.parseInt(str.replaceAll("[^0-9]", ""));
		   String currencyType = str.replaceAll("[^A-Za-z]", "").toUpperCase();
		   
		   int res = 0;
		   Set<String> keys = mObj.keySet();
		   for(String key: keys){
			   if(key.equals(currencyType)){
				   System.out.println("updated:"+currencyType+mObj.get(key));
				   res += num * (Integer.parseInt(mObj.get(key))); 
				   break;
			   }
		   }
        return res;
	    }	
	
		    	    	     	      	 	

}

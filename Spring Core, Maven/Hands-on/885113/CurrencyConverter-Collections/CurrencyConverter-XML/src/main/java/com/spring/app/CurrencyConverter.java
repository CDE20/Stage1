package com.spring.app;
import java.util.*;

public class CurrencyConverter {
	private Map<String,String> mObj;
	
	public Map<String,String> getMObj(){
	    return mObj;
	}
	
	public void setMObj(Map<String,String> mObj){
	    this.mObj=mObj;
	}
	    public int getTotalCurrencyValue(String value)
    	{
    	int result=0;   
String str1=value.replaceAll("[^a-zA-Z]", "").toUpperCase();
String str2=value.replaceAll("[^0-9]", "");
int a=Integer.parseInt(str2);
String str3=str1;
	if(mObj.containsKey(str1)) {
		String z=mObj.get(str1);
		result=Integer.parseInt(z);
		result=result*a;
	}

	
return result;
	 
	    }	
	
		    	    	     	      	 	

}

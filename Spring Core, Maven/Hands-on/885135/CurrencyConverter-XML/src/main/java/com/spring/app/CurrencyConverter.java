package com.spring.app;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
	
	private Map<String,String> mObj=new HashMap<String, String>();
	
	
	
	    public Map<String, String> getmObj() {
		return mObj;
	}



	public void setmObj(Map<String, String> mObj) {
		this.mObj = mObj;
	}



		public int getTotalCurrencyValue(String value)
    	{
			Map<String,String> map=getmObj();
			
			String temp="";
			int i;
			for(i=0;i<value.length();i++) {
				if(Character.isDigit(value.charAt(i))) {
					temp+=value.charAt(i);
				}
				else
					break;
			}
			int amount=Integer.parseInt(temp);
			value=value.substring(i);
			for(Map.Entry<String,String> entry : map.entrySet()) {
				if(entry.getKey().equalsIgnoreCase(value)) {
					return amount*Integer.parseInt(entry.getValue());
				}
			}
			return 0;
	    }	
	
		
		    	    	     	      	 	

}

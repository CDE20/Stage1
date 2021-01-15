package com.spring.app;
import java.util.Map;
import java.util.*;
import java.io.*;


public class CurrencyConverter {
	
	      private Map<String,String> mObj;
	    public Map<String, String> getmObj() {
    		return mObj;
    	}
    
    	public void setmObj(Map<String, String> mObj) {
    		this.mObj = mObj;
    	}
    	
    
	    public int getTotalCurrencyValue(String value)
    	{
	        
	        
 	        String v="0";
 	        
 	        
	        int k=0;
	        int a1=0;
	        String[] temp=value.split("");
	        StringBuffer f = new StringBuffer();
	         for (int i = 0; i < temp.length; i++)
	        {
              if((temp[i].matches("[0-9]+"))) 
               {
                 f.append(temp[i]);
               }else 
               {
                   a1 = Integer.parseInt(f.toString());
                   k=i;
                   break;
               }   
            }
	        
	        
	        
	        String asnewString="";
            for(int i=k;i<temp.length;i++)
            {
             asnewString +=temp[i];
            }
            asnewString = asnewString.toUpperCase();
            
            
            
            Map<String,String> tempObj = new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
            tempObj = getmObj();
        
            if (tempObj.containsKey(asnewString)) 
	             {  
	                 v = tempObj.get(asnewString);
	             }
	             
	        int result = a1 * Integer.parseInt(v);     
	             
	        return result;
	    }	
	
		
}

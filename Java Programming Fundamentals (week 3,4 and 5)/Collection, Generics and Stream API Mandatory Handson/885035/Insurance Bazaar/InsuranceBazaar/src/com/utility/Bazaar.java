package com.utility;
import java.util.*;
import com.ui.*;

public class Bazaar {
	
	
	
	private Map<Integer,String> policyMap=new TreeMap<Integer, String>();
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{
		Map <Integer,String> map=getPolicyMap();
		map.put(policyId,policyName);
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public List<Integer> searchBasedOnPolicyType(String policyType){
		
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer, String> entry : policyMap.entrySet()) {
			if(entry.getValue().contains(policyType)) {
				list.add(entry.getKey());
			}
		}
	
		return list;
		
	}
	

}


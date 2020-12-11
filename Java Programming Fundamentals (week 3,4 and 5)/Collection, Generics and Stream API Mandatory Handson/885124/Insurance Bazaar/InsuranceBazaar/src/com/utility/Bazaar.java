package com.utility;
import com.ui.*;
import java.util.*;


public class Bazaar {
                
                private Map<Integer,String> policyMap=new TreeMap<>();
                
                public Map<Integer, String> getPolicyMap() {
                                return policyMap;
                }

                public void setPolicyMap(Map<Integer, String> policyMap) {
                                this.policyMap = policyMap;
                }

                //This method should add the policyID as key and policyName as value into the policyMap
                public void addPolicyDetails(int policyId,String policyName)
                {
                                policyMap.put(policyId,policyName);
                }
                public void display()
                {
                                Set<Integer> keyset=policyMap.keySet();
                                
                                for(Integer key:keyset)
                                {
                                    System.out.println(""+key+" "+policyMap.get(key));
                                }
                }
                
              
                public List<Integer> searchBasedOnPolicyType(String policyType){
                                                List<Integer> list=new ArrayList<Integer>();
                                                for(Map.Entry<Integer,String> i:this.getPolicyMap().entrySet())
                                                {
                                                    if(i.getValue().contains(policyType))
                                                    {
                                                        list.add(i.getKey());
                                                    }
                                                }
                
                                return list;
                }

}


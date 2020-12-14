package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		
		Bazaar bazaar = new Bazaar();
		
    	System.out.println("Enter the no of Policy names you want to store");
    	int n = Integer.parseInt(sc.nextLine());
    	
    	for(int i=0;i<n;i++)
    	{
    	    System.out.println("Enter the Policy ID");
    	    int id =Integer.parseInt(sc.nextLine());
    	    System.out.println("Enter the Policy Name");
    	    String pname = sc.nextLine();
    	    bazaar.addPolicyDetails(id,pname);
    	}
    		
    	TreeMap<Integer,String> sort = new TreeMap<Integer,String>();
    	sort.putAll(bazaar.getPolicyMap());
    	for(Map.Entry<Integer,String> entry : sort.entrySet())
    	{
    	    System.out.println(entry.getKey()+" "+entry.getValue());
    	}
    	
    	List<Integer> b = new ArrayList<Integer>();
    	
    	System.out.println("Enter the policy type to be searched");
    	String spolicy = sc.nextLine();
    	
    	b=bazaar.searchBasedOnPolicyType(spolicy);
    	Collections.sort(b);
    	
    	for(int i=0;i<b.size();i++)
    	{
    	    System.out.println(b.get(i));
		}

	}

}

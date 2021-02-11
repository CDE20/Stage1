package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		Bazaar b = new Bazaar();
		
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		
		//int id;
		//String name;
		for(int i=0;i<n;i++)
		{
		    System.out.println("Enter the Policy ID");
		    int id=sc.nextInt();
		    System.out.println("Enter the Policy Name");
		    String name=sc.nextLine();
		    name=name+sc.nextLine();
		    b.addPolicyDetails(id,name);
		}

		//Fill the UI code
		for(Map.Entry tm:b.getPolicyMap().entrySet())
		{
		    System.out.println(tm.getKey()+" "+tm.getValue());
		}
		
		String searchType;
		System.out.println("Enter the policy type to be searched");
        searchType=sc.next();
        List<Integer> l=b.searchBasedOnPolicyType(searchType);
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        
	}

}

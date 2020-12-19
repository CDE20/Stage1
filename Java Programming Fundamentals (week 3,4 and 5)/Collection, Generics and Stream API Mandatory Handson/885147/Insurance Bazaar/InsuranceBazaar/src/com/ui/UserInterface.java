package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar b = new Bazaar();
		
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		int policyId;
		String policyName;
		for(int i=0;i<n;i++){
		    System.out.println("Enter the Policy ID");
		    policyId=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    policyName=sc.nextLine();
		    b.addPolicyDetails(policyId,policyName);
		}
		
		Map<Integer,String> pm = b.getPolicyMap();
		Map<Integer, String> map = new TreeMap<>(pm);
		for(Integer i : map.keySet()){
		    System.out.println(i + " "+ map.get(i));
		}
		
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		
		List<Integer> l = b.searchBasedOnPolicyType(policyType);
		Collections.sort(l);
		for(int a:l) {
			System.out.println(a);
		}
		
		
	}

}

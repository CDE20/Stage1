package com.ui;
import com.utility.Bazaar;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		Bazaar b=new Bazaar();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Policy ID");
			int policyId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Policy Name");
			String policyName=sc.nextLine();
			
			b.addPolicyDetails(policyId, policyName);
		}
		
		Map<Integer,String> policyMap=b.getPolicyMap();
		for(Map.Entry<Integer, String> entry : policyMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Enter the policy type to be searched");
		String policyType=sc.next();
		List<Integer> list= b.searchBasedOnPolicyType(policyType);
		for(int i : list) {
			System.out.println(i);
		}
	}
}


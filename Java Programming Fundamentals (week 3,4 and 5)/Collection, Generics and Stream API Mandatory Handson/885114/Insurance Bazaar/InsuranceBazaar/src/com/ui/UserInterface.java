package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		
		Map<Integer, String> map = new TreeMap<>();
		Bazaar bazaar = new Bazaar();
		bazaar.setPolicyMap(map);
		
		System.out.println("Enter the no of Policy names you want to store");
		int n = Integer.parseInt(sc.nextLine());
		
		while (n-- > 0) {
			System.out.println("Enter the Policy ID");
			int policyId = Integer.parseInt(sc.nextLine());
			System.out.println("Enter the Policy Name");
			String policyName = sc.nextLine();
			
			bazaar.addPolicyDetails(policyId, policyName);
		}
		
		
		for (Map.Entry<Integer, String> entry : bazaar.getPolicyMap().entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		
		List<Integer> policies = bazaar.searchBasedOnPolicyType(policyType);
		
		for (int policyId : policies) {
			System.out.println(policyId);
		}
		
	}

}

package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar B = new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the Policy ID");
			int Id = sc.nextInt();
			System.out.println("Enter the Policy Name");
			sc.nextLine();
			String policy = sc.nextLine();
			B.addPolicyDetails(Id, policy);
			}
			
			Map<Integer,String> map= B.getPolicyMap();
			Set<Integer> keySet = map.keySet();
			for (Integer i : keySet) {
				System.out.println(i + " " + map.get(i));
			}
			
			System.out.println("Enter the policy type to be searched");
			String policyType = sc.nextLine();
			
			List<Integer> list = B.searchBasedOnPolicyType(policyType);
			for (Integer integer : list) {
				System.out.println(integer);
			}
	}

}

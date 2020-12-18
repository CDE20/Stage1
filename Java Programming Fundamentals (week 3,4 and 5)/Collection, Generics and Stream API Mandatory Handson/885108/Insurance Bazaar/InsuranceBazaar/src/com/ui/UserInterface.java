package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		int n,key;
		String value;
		System.out.println("Enter the no of Policy names you want to store");
		n = sc.nextInt();
		Bazaar b = new Bazaar();
		Map<Integer,String> map = new TreeMap<>();
		b.setPolicyMap(map);
		for(int i = 0;i < n;i++) {
			System.out.println("Enter the Policy ID");
			key =sc.nextInt();
			System.out.println("Enter the Policy Name");
			sc.nextLine();
			value = sc.nextLine();
			b.addPolicyDetails(key, value);
		}
		map = b.getPolicyMap();
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("Enter the policy type to be searched");
		String policyType = sc.nextLine();
		List<Integer> list = b.searchBasedOnPolicyType(policyType);
		for(Integer num : list) {
			System.out.println(num);
		}
	}

}

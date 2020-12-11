package com.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.utility.Bazaar;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Fill the UI code
		Bazaar b = new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Policy ID");
			int pid = sc.nextInt();
			System.out.println("Enter the Policy Name");
			sc.nextLine();
			String pname = sc.nextLine();
			b.addPolicyDetails(pid, pname);
		}

		List<Integer> insuranceList = new ArrayList<Integer>(b.getPolicyMap().keySet());
		Collections.sort(insuranceList);
		for (int id : insuranceList) {
			System.out.println(id + " " + b.getPolicyMap().get(id));
		}

		System.out.println("Enter the policy type to be searched");
		// sc.nextLine();
		String pType = sc.nextLine();
		insuranceList = b.searchBasedOnPolicyType(pType);
		Collections.sort(insuranceList);
		for (int id : insuranceList) {
			System.out.println(id);
		}

	}

}

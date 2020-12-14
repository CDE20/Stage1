package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Map<Integer,String> set= new HashMap<>();
		Bazaar bz= new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
		    System.out.println("Enter the Policy ID");
		    int id=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    String name=sc.nextLine();
		    //bz.addPolicyDetails(id,name);
		    set.put(id,name);
		}
		bz.setPolicyMap(set);
		//Map<Integer,String> displaymap=bz.getPolicyMap();
		Set<Integer> mapkeys= set.keySet();
		List<Integer> k= new ArrayList<>(mapkeys);
		Collections.sort(k);
		for(Integer element:k){
		   System.out.println(element+" "+set.get(element));
	}
		
		System.out.println("Enter the policy type to be searched");
		String policytype=sc.nextLine();
		List<Integer> list= bz.searchBasedOnPolicyType(policytype);
		for(Integer key:list){
		    System.out.println(key);
		}
		

	}

}

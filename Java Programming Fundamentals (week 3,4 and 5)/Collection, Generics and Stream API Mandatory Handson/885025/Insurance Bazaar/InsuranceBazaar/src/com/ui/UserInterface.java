package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar b=new Bazaar();
		b.setPolicyMap(new TreeMap<>());
	    System.out.println("Enter the no of Policy names you want to store");
	    int n=sc.nextInt();
	    int polid;
	    String polname="";
	    for(int i=0;i<n;i++){
	        System.out.println("Enter the Policy ID");
	        polid=sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter the Policy Name");
	        polname=sc.nextLine();
	        b.addPolicyDetails(polid,polname);
	        
	    }
	    Map<Integer,String> m = b.getPolicyMap();
	    Set<Integer> k=m.keySet();
	    for(Integer key: k){
	        System.out.println(key+" "+m.get(key));
	    }
	    System.out.println("Enter the policy type to be searched");
	        String  poltyp=sc.nextLine();
	        List<Integer> list = b.searchBasedOnPolicyType(poltyp);
	        for(Integer pi:list){
	            System.out.println(pi);
	        }
	    
	    
	    
	    
	    
	}

}

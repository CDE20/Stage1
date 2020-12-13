package com.ui;
import com.utility.*;
import java.util.*;
import java.io.*;

public class UserInterface {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int num,id;
		String pname,type;
		System.out.println("Enter the no of Policy names you want to store");
		num=sc.nextInt();
		Bazaar b=new Bazaar();
		for(int i=0;i<num;i++){
		    System.out.println("Enter the Policy ID");
		    id=sc.nextInt();
		    System.out.println("Enter the Policy Name");
		    pname=br.readLine();
            b.addPolicyDetails(id,pname);
		}
		b.printPolicy();
		System.out.println("Enter the policy type to be searched");
		type=br.readLine();
		b.searchBasedOnPolicyType(type);
		

	}

}


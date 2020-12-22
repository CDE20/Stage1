package com.ui;
import com.utility.*;
import java.util.*;
public class UserInterface
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int number=sc.nextInt();
		Bazaar bazaar=new Bazaar();
		bazaar.setPolicyMap(new TreeMap<Integer, String>());
		for(int i=0;i<number;i++)
		{
		    System.out.println("Enter the Policy ID");
		    int policyId=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    String policyName=sc.nextLine().trim();
		    bazaar.addPolicyDetails(policyId, policyName);
		}
		for(Map.Entry<Integer,String> policy : bazaar.getPolicyMap().entrySet())
	    {
		    System.out.println(policy.getKey()+" "+policy.getValue());
		}
		System.out.println("Enter the policy type to be searched");
		List<Integer> results=bazaar.searchBasedOnPolicyType(sc.nextLine().trim());
		for(Integer policyId : results)
		{
		    System.out.println(policyId);
		}
		sc.close();
	}
}

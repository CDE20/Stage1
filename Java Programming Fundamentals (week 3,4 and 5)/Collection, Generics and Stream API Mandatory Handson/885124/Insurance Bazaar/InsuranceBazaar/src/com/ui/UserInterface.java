package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {

                public static void main(String[] args) {
                                // TODO Auto-generated method stub
                                Scanner sc =new Scanner(System.in);
                                //Fill the UI code
                                List<Integer> list1=new ArrayList<>();
                                Bazaar b=new Bazaar();
                                int i,id,n;
                                String name,name1;
                                System.out.println("Enter the no of policy names you want to store");
                                n=sc.nextInt();
                                for(i=0;i<n;i++)
                                {
                                    System.out.println("Enter the Policy ID");
                                    id=sc.nextInt();
                                    sc.nextLine();
                                   System.out.println("Enter the Policy Name");
                                    name=sc.nextLine();
                                    b.addPolicyDetails(id,name);
                                }
                                b.display();
                                System.out.println("Enter the policy type to be searched");
                                name1=sc.nextLine();
                                list1=b.searchBasedOnPolicyType(name1);
                                for(Integer k:list1)
                                System.out.println(k);
     }

}

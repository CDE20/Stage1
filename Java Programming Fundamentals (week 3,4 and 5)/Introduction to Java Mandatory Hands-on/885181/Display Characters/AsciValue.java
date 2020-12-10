/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class AsciValue
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int[] a=new int[4];
	    System.out.println("Enter the digits:");
	    for(int i=0;i<4;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    char[] b=new char[4];
	    
	    for(int i=0;i<4;i++)
	        b[i]=(char)a[i];
	    
	    for(int i=0;i<4;i++)
	    {
		    System.out.println(a[i]+"-"+b[i]);
	    }
	        
	    }
}

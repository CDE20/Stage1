import java.util.Scanner;

public class Main {
	 public static void main (String[] args) {
	     Scanner sc=new Scanner(System.in);
	     
	     int n=sc.nextInt();
	     String name[]=new String[n];
	     int price[]=new int[n];
	     int discount[]=new int[n];
	     int min=Integer.MAX_VALUE;
	     
	     for(int i=0;i<n;i++) {
	    	 String temp[]=new String[3];
	    	 String str=sc.next();
	    	 temp=str.split(",");
	    	 name[i]=temp[0];
	    	 price[i]=Integer.parseInt(temp[1]);
	    	 discount[i]=(price[i]*(Integer.parseInt(temp[2])))/100;
	    	 //System.out.println(discount[i]);
	    	 if(min>discount[i]) {
	    		 min=discount[i];
	    		 
	    	 }
	     }
	     for(int x:discount) {
	    	 System.out.println(x);
	     }
	     for(int i=0;i<n;i++) {
	    	 if(discount[i]==min) {
	    		 System.out.println(name[i]);
	    	 }
	     }
	        
	    }
}

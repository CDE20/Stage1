import java.util.*;
public class Main{
    	public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
         
            int n = Integer.parseInt(sc.nextLine());
            String[] products = new String[n];
            int[] discounts = new int[n];
            
            for (int i = 0; i < n; i++) {
                String[] input = sc.nextLine().split(",");
                products[i] = input[0];
                discounts[i] = Integer.parseInt(input[1]) * Integer.parseInt(input[2]) / 100;
            }
            
            int min = discounts[0];
            for (int i = 0; i < discounts.length; i++) {
                if (discounts[i] < min) {
                    min = discounts[i];
                }
            }
            
            for (int i = 0; i < discounts.length; i++) {
                if (discounts[i] == min) {
                    System.out.println(products[i]);
                }
            }
            
    //        for (int a: discounts) {
    //        	System.out.print(a + " ");
    //        }
    //        System.out.println();
    //        
    //        for (String a: products) {
    //        	System.out.print(a + " ");
    //        }
    //        System.out.println();
    	}
}
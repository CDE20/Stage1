import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
     String index="";
     String[] info;
     int amount_arr[]= new int[n];
     String names[]= new String[n];
     int price[]= new int[n];
     int discount[]= new int[n];
     String arr[]=new String[n];
     sc.nextLine();
     for(int i=0;i<n;i++){
         arr[i]=sc.nextLine();
         info=arr[i].split(",");
         //System.out.println(info[0]);
         names[i]=info[0];
         price[i]=Integer.parseInt(info[1]);
         discount[i]=Integer.parseInt(info[2]);
         amount_arr[i]=(price[i]*discount[i])/100;
     }
     int discount_minimum=amount_arr[0];
     for(int i=1;i<n;i++){
         if(discount_minimum>=amount_arr[i]){
             discount_minimum=amount_arr[i];
         }
     }
     for(int i=0;i<n;i++){
         if(discount_minimum==amount_arr[i]){
             System.out.println(names[i]);
         }
     }
     
     
     // Fill the code here
        
    }
}
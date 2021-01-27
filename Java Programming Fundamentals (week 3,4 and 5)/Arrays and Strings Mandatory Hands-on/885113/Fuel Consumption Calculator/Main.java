import java.util.*;
import java.text.*;
class Main{
    
     public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int liters,distance;
        System.out.println("Enter the no of liters to fill the tank");
        liters=sc.nextInt();
        if(liters<=0)
        System.out.println(liters+" is an Invalid Input");
        else{
        System.out.println("Enter the distance covered");
        distance=sc.nextInt();
        if(distance<=0)
        System.out.println(distance+" is an Invalid Input");
        else{
        double litperkm=(double)liters/distance*100;
        double milpergal=(distance*0.6214)/(liters*0.2642);
      
         System.out.printf("Liters/100KM\n%.2f",litperkm);
         System.out.printf("\nMiles/gallons\n%.2f",milpergal);
        }
        }
         
     }
}
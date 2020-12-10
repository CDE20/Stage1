import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float liters=sc.nextFloat();
        
         if(liters<=0)
         {
             System.out.println((int)liters+" is an Invalid Input");
         }
         else
         {
            System.out.println("Enter the distance covered");
            double distance=sc.nextFloat();
         
            if(distance<=0)
            {
                 System.out.println((int)distance+" is an Invalid Input");
            }
            else
            {
                double x=0.6214;
                double fuel_consumption=(liters/distance)*100;
                double distancemiles=(distance*x);
                double gallons=(liters*0.2642);
                double milespergallon=(distancemiles/gallons);
         
                System.out.print("Liters/100KM ");
                System.out.printf("%.2f",fuel_consumption);
                System.out.println();
                System.out.print("Miles/gallons ");
                System.out.printf("%.2f",milespergallon);
            }
         }
    }
}
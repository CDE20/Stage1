import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) {
        int petrol,distance;
        float litersPerKm,milesPerGallon;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        petrol = sc.nextInt();
        
        
        if(petrol>0){
            System.out.println("Enter the distance covered");
            distance = sc.nextInt();
            if(distance>0){
                litersPerKm = (float)(petrol*100)/distance;
                System.out.printf("Liters/100KM\n%.2f",litersPerKm);
                
                double a,b;
                a=distance * 0.6214;
                b=petrol * 0.2642;
                milesPerGallon = (float)(a/b);
                System.out.printf("\nMiles/gallons\n%.2f", milesPerGallon);
            }
            else{
                 System.out.println(distance + " is an Invalid Input");
            }
        }
        else{
            System.out.println(petrol + " is an Invalid Input");
        }
    }
}
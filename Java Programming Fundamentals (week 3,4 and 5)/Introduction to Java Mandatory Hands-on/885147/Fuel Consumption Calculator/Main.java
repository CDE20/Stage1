import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int no_of_litres=sc.nextInt();
        
        if(no_of_litres <= 0){
            System.out.println(no_of_litres +" is an Invalid Input");
            System.exit(1);
        }
        System.out.println("Enter the distance covered");
        int distance_covered=sc.nextInt();
        
        if(distance_covered <= 0){
            System.out.println(distance_covered +" is an Invalid Input");
            System.exit(1);
        }
        if(no_of_litres > 0 && distance_covered > 0){
        
        float litres_per_100KM = ((float)no_of_litres/(float)distance_covered)*100;
        double miles=(double)distance_covered * 0.6214;
        double gallons = (double)no_of_litres * 0.2642;
        
        System.out.printf("Liters/100KM \n %.2f",litres_per_100KM);
        System.out.printf("\nMiles/gallons \n %.2f",miles/gallons);
        }
    }
}
import java.util.*;
public class Main
{
    public static void main(String args[])
    {  
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the no of liters to fill the tank");
        float litres = s.nextFloat();
        if(litres<1)
        {
            System.out.println((int)litres + " is an Invalid Input");
            return;
        }
        System.out.println("Enter the distance covered");
        float kms = s.nextFloat();
        if(kms<1)
        {
            System.out.println((int)kms + " is an Invalid Input");
            return;
        }
        float x=litres/kms*100;
        System.out.printf("Liters/100KM\n %.2f",x);
        
        double miles=kms*0.6214;
        double gallons=litres*0.2642;
        
        System.out.printf("\nMiles/gallons\n %.2f",miles/gallons);
    }    
    
}
import java.util.*;
public class Main {
    public static void main (String[] args) {
        int liter, distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        liter = sc.nextInt();
        if(liter<=0)
        {
            System.out.println(liter+" is an Invalid Input");
        }
        else
        {
            System.out.println("Enter the distance covered");
            distance = sc.nextInt();
            if(distance>0)
            {
                double l = liter*1.0;
                double d = distance*1.0;
                System.out.println("Liters/100KM");
                double p1 = (l/d)*100;
                System.out.println(String.format("%.2f", p1));
                System.out.println("Miles/gallons");
                double p2 = ((d*0.6214)/(l*0.2642));
                System.out.println(String.format("%.2f", p2));
            }
            else
            {
                System.out.println(distance+" is an Invalid Input");
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liters = sc.nextInt();
        
        if (liters <= 0) {
            System.out.println((int)liters + " is an Invalid Input");
            return;
        }
        
        System.out.println("Enter the distance covered");
        double distance = sc.nextInt();
        
        if (distance <= 0) {
            System.out.println((int)distance + " is an Invalid Input");
            return;
        }
        
        double output = 0;
        
        System.out.println("Liters/100KM");
        output = 100 * (liters / distance);
        System.out.printf("%.2f", output);
        
        System.out.println();
        
        System.out.println("Miles/gallons");
        output = (0.6214*distance)/(0.2642*liters);
        System.out.printf("%.2f", output);
    
        
    }
}
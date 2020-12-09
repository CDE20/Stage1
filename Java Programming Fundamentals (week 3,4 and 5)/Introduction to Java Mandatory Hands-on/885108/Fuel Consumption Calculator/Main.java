import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
        double liter,distance;
        double mile,km;
        liter = sc.nextDouble();
        if(liter > 0){
            System.out.println("Enter the distance covered");
            distance = sc.nextDouble();
            if(distance > 0){
                km = (liter/distance)*100;
                mile = (distance*0.6214)/(liter*0.2642);
                System.out.println("Liters/100KM");
                System.out.printf("%.2f \n",km);
                System.out.println("Miles/gallons");
                System.out.printf("%.2f \n",mile);
            }
            else
                System.out.printf("%.0f is an Invalid Input",distance);
        }
        else{
            System.out.printf("%.0f is an Invalid Input",liter);
        }
        sc.close();
	}

}

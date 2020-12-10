import java.util.Scanner;

public class Main {
	
	private static void calculateConsumption(double liters, double distance) {
		// TODO Auto-generated method stub
		System.out.println("Liters/100KM");
		System.out.printf("%.2f",(liters/distance)*100);
		double miles=distance*0.6214;
		double gallons=liters*0.2642;
		System.out.printf("\nMiles/gallons\n%.2f",(miles/gallons));
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		double liters=sc.nextInt();
		if(liters<=0) {
			if(liters%1==0) 
				System.out.printf("%.0f is an Invalid Input",liters);
			else
				System.out.println(liters+" is an Invalid Input");
			sc.close();
			return;
		}
			
		System.out.println("Enter the distance covered");
		double distance=sc.nextInt();
		if(distance<=0) {
			if(distance%1==0) 
				System.out.printf("%.0f is an Invalid Input",distance);
			else
				System.out.printf(distance+" is an Invalid Input");
			sc.close();
			return;
		}
		calculateConsumption(liters,distance);
		sc.close();
	}

	
}

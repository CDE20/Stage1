import java.util.Scanner;

class Main{
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		int noOfLiters = sc.nextInt();
		if(noOfLiters<=0) {
			System.out.println(noOfLiters + " is an invalid input");
		}
		else {
			System.out.println("Enter the distance covered");
			int distanceCovered = sc.nextInt();
			if(distanceCovered<=0) {
				System.out.println(distanceCovered + " is an invalid input");
			}
			else {
				
				System.out.println("Liters/100KM");
				double input =((double)noOfLiters/(double)distanceCovered)*100;
				System.out.printf("%.2f",input);
				
				double miles = distanceCovered * 0.6214;
				double gallons = noOfLiters * 0.2642;
				System.out.println();
				System.out.println("Miles/gallons");
				System.out.format("%.2f",miles/gallons);
			}
		}
	}
}
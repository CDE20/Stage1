
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		System.out.println("Enter the source");
		String source = sc.nextLine();
		
		System.out.println("Enter the destination");
		String destination = sc.nextLine();
		
		System.out.println("Enter the coach type");
		String coachType = sc.nextLine();
		String ct = coachType.toLowerCase();
		
		if (ct.equals("ac1") || ct.equals("ac2") || ct.equals("ac3") || ct.equals("sleeper") || ct.equals("seater")) {
			TrainManagementSystem tms = new TrainManagementSystem();
			ArrayList<Train> trains = tms.viewTrain(coachType, source, destination);
			
			if (trains.size() > 0) {
				for (Train train : trains) {
					System.out.println(train.getTrainNumber() + " " + train.getTrainName());
				}				
			}
			else {
				System.out.println("No trains found");
			}
		}
		else {
			System.out.println("Invalid Coach Type");
		}
		
		
	}
}
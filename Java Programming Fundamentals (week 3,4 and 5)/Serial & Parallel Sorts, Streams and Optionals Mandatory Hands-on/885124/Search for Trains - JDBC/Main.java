
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		TrainManagementSystem tms = new TrainManagementSystem();
		ArrayList<Train> alist = new ArrayList<>();
		String source,destination;
		String coachType;
		
		System.out.println("Enter the source");
		source = sc.nextLine();
		System.out.println("Enter the destination");
		destination = sc.nextLine();
		System.out.println("Enter the coach type");
		coachType = sc.nextLine();
		
		if(coachType.equalsIgnoreCase("AC1") || coachType.equalsIgnoreCase("AC2") || coachType.equalsIgnoreCase("AC3")||coachType.equalsIgnoreCase("Sleeper")||coachType.equalsIgnoreCase("Seater")) {
			alist=tms.viewTrain(coachType, source, destination);
			if(!alist.isEmpty()) {
				for(Train t:alist) {
					System.out.println(t.getTrainNumber()+" "+t.getTrainName());
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
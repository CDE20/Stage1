
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

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

		if (coachType.equalsIgnoreCase("ac1") || coachType.equalsIgnoreCase("ac2") || coachType.equalsIgnoreCase("ac3")
				|| coachType.equalsIgnoreCase("sleeper") || coachType.equalsIgnoreCase("seater")) {
			ArrayList<Train> train = new TrainManagementSystem().viewTrain(coachType,source, destination);
			if (train.isEmpty())
				System.out.println("No trains found");
			else {
				Comparator<Train> C = (i1,i2)->{
					if(i1.getTrainNumber()>i2.getTrainNumber())
						return 1;
					else if(i1.getTrainNumber() < i2.getTrainNumber())
						return -1;
					else return 0;
				};
				train.sort(C);
				for (Train t : train) {
					System.out.println(t.getTrainNumber() + " " + t.getTrainName());
				}
			}
		} else
			System.out.println("Invalid Coach Type");

	}
}
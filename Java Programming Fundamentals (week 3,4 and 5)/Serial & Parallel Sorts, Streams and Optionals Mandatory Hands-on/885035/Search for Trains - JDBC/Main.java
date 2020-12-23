
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		System.out.println("Enter the source");
		String source=sc.nextLine();
		System.out.println("Enter the destination");
		String destination = sc.nextLine();
		System.out.println("Enter the coach type");
		String coachType=sc.nextLine();
		//System.out.println("input read");
		if(coachType.equalsIgnoreCase("AC1")||coachType.equalsIgnoreCase("AC2")||coachType.equalsIgnoreCase("AC3")||
				coachType.equalsIgnoreCase("Sleeper")||coachType.equalsIgnoreCase("Seater")) {
				    //System.out.println("in if");
			TrainManagementSystem t=new TrainManagementSystem();
			ArrayList<Train> list= t.viewTrain(coachType.toLowerCase(), source, destination);
			if(!(list.isEmpty())) {
				for(Train train : list) {
					System.out.println(train.getTrainNumber()+" "+train.getTrainName());
				}
			}
			else {
				System.out.println("No trains found");
				return;
			}
		}
		else {
			System.out.println("Invalid Coach Type");
			return;
		}
		
	}
}
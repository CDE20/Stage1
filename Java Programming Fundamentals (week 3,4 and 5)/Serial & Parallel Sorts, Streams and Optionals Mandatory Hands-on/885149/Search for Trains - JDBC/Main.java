import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		System.out.println("Enter the source");
		String src=sc.nextLine();
		System.out.println("Enter the destination");
		String des=sc.nextLine();
		System.out.println("Enter the coach type");
		String coach=sc.nextLine();
		
		if(coach.equalsIgnoreCase("AC1")||coach.equalsIgnoreCase("AC2")||coach.equalsIgnoreCase("AC3")||coach.equalsIgnoreCase("Sleeper")||coach.equalsIgnoreCase("Seater")){
		    TrainManagementSystem trmngt=new TrainManagementSystem();
		    ArrayList<Train> trnlist = new ArrayList<>();
		    trnlist=trmngt.viewTrain(coach,src,des);
		    if(trnlist.isEmpty()){
		        System.out.println("No trains found");
		    }
		    else{
		        for(Train t:trnlist){
		            System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		        }
		    }
		}
		else{
		    System.out.println("Invalid Coach Type");
		}
		
	}
}
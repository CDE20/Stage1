
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		String[] coachType = {"ac1", "ac2", "ac3", "sleeper", "seater"};
		System.out.println("Enter the source");
		String source = sc.next();
		System.out.println("Enter the destination");
		String destination = sc.next();
		System.out.println("Enter the coach type");
		String coach = sc.next();
		int flag = 0;
		int i = 0;
		for(i=0; i<coachType.length; i++)
		{
		    if(coachType[i].equalsIgnoreCase(coach))
		    {
		        flag = 1;
		        break;
		    }
		}
		if(flag == 1)
		{
		    TrainManagementSystem tms = new TrainManagementSystem();
		    ArrayList<Train> lists = tms.viewTrain(coach, source, destination);
		    if(lists.size()>0)
		    {
		        for(Train t: lists)
		        {
		            System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		        }
		    }
		    else
		        System.out.println("No trains found");
		}
		else {
		    System.out.println("Invalid Coach Type");
		}

		
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrainManagementSystem tms=new TrainManagementSystem();
		// fill your code here

        System.out.println("Enter the source");
        String source=sc.next();
        System.out.println("Enter the destination");
        String destination=sc.next();
		System.out.println("Enter the coach type");
        String coach=sc.next();
		
		coach=coach.toLowerCase();
		if(coach.equals("ac1") ||coach.equals("ac2") || coach.equals("ac3") || coach.equals("sleeper") || coach.equals("seater"))
		{
		    	ArrayList<Train> trains = tms.viewTrain(coach,source,destination);
		    	for(int i=0;i<trains.size();i++)
		    	{
		    	    Train t=trains.get(i);
		    	    System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		    	}
		}
		else
		{
		    System.out.println("Invalid Coach Type");
		}
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		TrainManagementSystem tm = new TrainManagementSystem();
		ArrayList<Train> l;
		System.out.println("Enter the source");
		String source = sc.nextLine();
		System.out.println("Enter the destination");
		String destination = sc.nextLine();
		
		System.out.println("Enter the coach type");
		String ctype = sc.nextLine().toLowerCase();
	
		if(ctype.equals("ac1")|| ctype.equals("ac2") || ctype.equals("ac3") || ctype.equals("sleeper") || ctype.equals("seater")){
		    	
		    l = tm.viewTrain(ctype,source,destination);
		    if(l.size()==0){System.out.println("No trains found");}
		    else{
		        for(Train o : l)
		           System.out.println(o.getTrainNumber() +" "+o.getTrainName());
		    }
		}
		else{
		    System.out.println("Invalid Coach Type");
		    
		}

		
	}
}
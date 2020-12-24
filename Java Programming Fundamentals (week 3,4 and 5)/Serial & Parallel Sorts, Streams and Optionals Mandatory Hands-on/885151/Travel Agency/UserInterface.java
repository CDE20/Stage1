import java.util.*;
public class UserInterface {

	public static void main(String args[]) {

		// Fill the code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of passengers");
		int n = sc.nextInt();
		Ticket[] tkts = new Ticket[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Details of Passenger "+(i+1)+":");
			System.out.println("Enter the pnr no:");
			long pnrNo = sc.nextLong();
			System.out.println("Enter passenger name:");
			String passengerName = sc.next();
			System.out.println("Enter seat no:");
			int seatNo = sc.nextInt();
			System.out.println("Enter class type:");
			String classType = sc.next();
			System.out.println("Enter ticket fare:");
			double ticketFare = sc.nextDouble();
			
			tkts[i] = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare);
		}
		
		CommissionInfo info = generateCommissionObtained();
		double comm = 0;
		for(Ticket t: tkts)
		{
			comm += info.calculateCommissionAmount(t);
		}
		System.out.println("Commission Obtained");
		System.out.printf("Commission obtained per each person: Rs.%.2f", comm);
	}

	public static CommissionInfo generateCommissionObtained() {

		CommissionInfo info = (tkt)-> { 
			double comm = 0;
			if(tkt.getClassType().equalsIgnoreCase("SL") || tkt.getClassType().equalsIgnoreCase("2S")) 
				comm = 60;
			if(tkt.getClassType().equalsIgnoreCase("1A") || tkt.getClassType().equalsIgnoreCase("2A") || tkt.getClassType().equalsIgnoreCase("3A")) 
				comm = 100;
			return comm;
		};
		
		return info;
	}
}

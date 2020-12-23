import java.util.Scanner;
public class UserInterface {
    
   public static CommissionInfo generateCommissionObtained () {
		CommissionInfo c = (TicketObj)->{
			if(TicketObj.getClassType().equalsIgnoreCase("SL")||TicketObj.getClassType().equalsIgnoreCase("2S"))
				return 60.00;
			if(TicketObj.getClassType().equalsIgnoreCase("1A")||TicketObj.getClassType().equalsIgnoreCase("2A")||TicketObj.getClassType().equalsIgnoreCase("3A"))
				return 100.00;
			
			else return 0;
		};
		return c;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the no of passengers");
        	int n=sc.nextInt();
        	Ticket[] t=new Ticket[n];
        	double commission=0;
        	for(int i=0;i<n;i++) {
        		
        		System.out.println("Details of Passenger "+(i+1)+":");
        		System.out.println("Enter the pnr no:");
        		long pnrNo=sc.nextLong();
        		System.out.println("Enter passenger name:");
        		String passengerName=sc.next();
        		System.out.println("Enter seat no:");
        		int seatNo=sc.nextInt();
        		System.out.println("Enter class type:");
        		String classType=sc.next();
        		System.out.println("Enter ticket fare:");
        		double ticketFare=sc.nextDouble();
        		t[i]=new Ticket(pnrNo,passengerName,seatNo,classType,ticketFare);
        		commission+=UserInterface.generateCommissionObtained().calculateCommissionAmount(t[i]);
        	}
        	System.out.println("Commission Obtained");
        	System.out.printf("Commission obtained per each person: Rs.%.2f",commission);
        	
	    
	    }
    
}
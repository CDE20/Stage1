import java.util.Scanner;

public class UserInterface {

	public static void main(String args[]) {
		//Ticket t = new Ticket();
		Scanner sc = new Scanner(System.in);
		int noOfPassengers,seatNo;
		long pnr;
		String name,classT;
		double ticketFare;
		
		System.out.println("Enter the no of passengers");
		noOfPassengers = Integer.parseInt(sc.nextLine());
		
		Ticket ticket[] = new Ticket[noOfPassengers];
		
		for(int i=0;i<noOfPassengers;i++) {
			System.out.println("Details of Passenger "+(i+1)+":");
			System.out.println("Enter the pnr no:");
			pnr = Long.parseLong(sc.nextLine());
			//t.setPnrNo(pnr);
			
			System.out.println("Enter passenger name:");
			name = sc.nextLine();
			//t.setPassengerName(name);
			
			System.out.println("Enter seat no:");
			seatNo = Integer.parseInt(sc.nextLine());
			//t.setSeatNo(seatNo);
			
			System.out.println("Enter class type:");
			classT = sc.nextLine();
			//t.setClassType(classT);

			System.out.println("Enter ticket fare:");
			ticketFare = Double.parseDouble(sc.nextLine());
			//t.setTicketFare(ticketFare);
			
			ticket[i]=new Ticket(pnr,name,seatNo,classT,ticketFare);
		}
		
		CommissionInfo cinfo = generateCommissionObtained();
		
		double d =0;
		for(Ticket t1:ticket) {
			d +=cinfo.calculateCommissionAmount(t1);
		}
		System.out.println("Commission Obtained");
		System.out.printf("Commission obtained per each person: Rs.%.2f",d);
	}

	

	public static CommissionInfo generateCommissionObtained() {
		CommissionInfo ci = (t)->{
			double commission=0;
			if(t.getClassType().equalsIgnoreCase("SL") || t.getClassType().equalsIgnoreCase("2S")) {
				commission = 60;
				//return commission;
			}
			if(t.getClassType().equalsIgnoreCase("1A")||t.getClassType().equalsIgnoreCase("2A")||t.getClassType().equalsIgnoreCase("3A")) {
				commission = 100;
				//return commission;
			}
			return commission;
			//return 0;
	
		};
		
		return ci;

	}



	

}
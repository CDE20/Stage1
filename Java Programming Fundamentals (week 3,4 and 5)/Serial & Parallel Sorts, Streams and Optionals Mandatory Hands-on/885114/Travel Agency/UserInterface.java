import java.util.Scanner;

public class UserInterface {

	public static void main(String args[]) {

		// Fill the code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of passengers");
		int count = Integer.parseInt(sc.nextLine());
		
		Ticket[] tickets = new Ticket[count];
		
		for (int i = 0; i < count; i++) {
			
			System.out.println("Details of Passenger " + (i+1) + ":");
			
			System.out.println("Enter the pnr no:");
			long pnr = Long.parseLong(sc.nextLine());
			
			System.out.println("Enter passenger name:");
			String name = sc.nextLine();
			
			System.out.println("Enter seat no:");
			int seatNo = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter class type:");
			String classType = sc.nextLine();
			
			System.out.println("Enter ticket fare:");
			double ticketFare = Double.parseDouble(sc.nextLine());
			
			Ticket ticket = new Ticket(pnr, name, seatNo, classType, ticketFare);
			
			tickets[i] = ticket;
		}
		
		CommissionInfo generateCommisionObtained = generateCommissionObtained();
		double commission = 0;
		for (int i = 0; i < count; i++) {
			commission += generateCommisionObtained.calculateCommissionAmount(tickets[i]);
		}
		      
		System.out.println("Commission Obtained");
		System.out.printf("Commission obtained per each person: Rs.%.2f", commission);
	}
	
	public static CommissionInfo generateCommissionObtained () {
		CommissionInfo c = t -> {
			
			double commission = 0;
			if (t.getClassType().equalsIgnoreCase("SL") || t.getClassType().equalsIgnoreCase("2S")) {
				commission = 60;
			}
			if (t.getClassType().equalsIgnoreCase("1A") || t.getClassType().equalsIgnoreCase("2A") || t.getClassType().equalsIgnoreCase("3A")) {
				commission = 100;
			}
			
			return commission;
		};
		
		return c;
	}

	

}
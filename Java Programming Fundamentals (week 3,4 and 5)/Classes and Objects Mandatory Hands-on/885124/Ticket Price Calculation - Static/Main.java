import java.util.*;

public class Main {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Scanner sc = new Scanner(System.in);
		int noOfBookings,availableTickets,ticketId,price,noOfTickets;
		
		System.out.println("Enter no of bookings:");
		noOfBookings = sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		availableTickets = sc.nextInt();
		t.setAvailableTickets(availableTickets);
		
		for(int i=0;i<noOfBookings;i++) {
			
			System.out.println("Enter the ticketid:");
			ticketId = sc.nextInt();
			t.setTicketid(ticketId);
			
			System.out.println("Enter the price:");
			price = sc.nextInt();
			t.setPrice(price);
			
			System.out.println("Enter the no of tickets:");
			noOfTickets = sc.nextInt();
			
			System.out.println("Available tickets:"+t.getAvailableTickets());
			
			//t.setAvailableTickets(availableTickets-noOfTickets);
			
			System.out.println("Total Amount:"+t.calculateTicketCost(noOfTickets));
			
			System.out.println("Available ticket after booking:"+t.getAvailableTickets());
		}
		
	}

}

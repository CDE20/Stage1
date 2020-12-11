import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ticket ticket = new Ticket();
		System.out.println("Enter no of bookings:");
		int n = sc.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets = sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the ticketid:");
			int ticketId = sc.nextInt();
			ticket.setTicketid(ticketId);
			System.out.println("Enter the price:");
			int price = sc.nextInt();
			ticket.setPrice(price);
			System.out.println("Enter the no of tickets:");
			int noOfTickets = sc.nextInt();
			int calculatedPrice = ticket.calculateTicketCost(noOfTickets);
			if(calculatedPrice == -1) {
				System.out.println("Tickets not available");
				break;
			}
			else {
				System.out.println("Available tickets:" + Ticket.getAvailableTickets());
				System.out.println("Total amount:" + calculatedPrice);
				System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());
				
			}
		}
	}
}
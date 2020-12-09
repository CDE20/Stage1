import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n_bookings,n_tickets,id,price,available_tickets;
		System.out.println("Enter no of bookings:");
		n_bookings = sc.nextInt();
		System.out.println("Enter the available tickets:");
		available_tickets = sc.nextInt();
		for(int i = 0;i < n_bookings;i++) {
			System.out.println("Enter the ticketid:");
			id = sc.nextInt();
			System.out.println("Enter the price:");
			price = sc.nextInt();
			System.out.println("Enter the no of tickets:");
			n_tickets = sc.nextInt();
			Ticket t = new Ticket();
			t.setPrice(price);
			t.setTicketid(id);
			Ticket.setAvailableTickets(available_tickets);
			System.out.println("Available tickets: "+t.getAvailableTickets());
			System.out.println("Total Amount:"+t.calculateTicketCost(n_tickets));
			System.out.println("Available Tickets after booking:"+t.getAvailableTickets());
		}
		sc.close();
	}

}

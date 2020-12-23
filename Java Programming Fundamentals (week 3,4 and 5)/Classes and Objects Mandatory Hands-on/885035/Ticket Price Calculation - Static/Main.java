import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int n=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets=sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		for(int i=0;i<n;i++) {
			Ticket t=new Ticket();
			System.out.println("Enter the ticketid:");
			t.setTicketid(sc.nextInt());
			System.out.println("Enter the price:");
			t.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets:");
			int nooftickets=sc.nextInt();
			System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			System.out.println("Total amount:"+t.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
		}
	}
}

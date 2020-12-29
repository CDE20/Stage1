import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

		Ticket t = new Ticket();

		System.out.println("Enter no of bookings:");
		int noOfBookings = sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		Ticket.setAvailableTickets(sc.nextInt());

		while (noOfBookings-- > 0) {

			System.out.println("\nEnter the ticketid:");
			t.setTicketid(sc.nextInt());

			System.out.println("Enter the price:");
			t.setPrice(sc.nextInt());

			System.out.println("Enter the no of tickets:");
			int noOfTickets = sc.nextInt();

			System.out.println("Available tickets: " + Ticket.getAvailableTickets());
			
			System.out.println("Total amount:" + t.calculateTicketCost(noOfTickets));
			
			System.out.println("Available ticket after booking:" + t.getAvailableTickets());

		}

        
    }
}
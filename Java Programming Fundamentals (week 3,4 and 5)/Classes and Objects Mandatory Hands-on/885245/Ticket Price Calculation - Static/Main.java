import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of bookings:");
		int noOfBookings = sc.nextInt();
		System.out.println("Enter the available tickets:");
		Ticket.setAvailableTickets(sc.nextInt());
		while (noOfBookings-- > 0) 
		{
			Ticket ticket = new Ticket();
			System.out.println("Enter the ticketid:");
			ticket.setTicketid(sc.nextInt());
			System.out.println("Enter the price:");
			ticket.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets:");
			int noOfTickets = sc.nextInt();
			System.out.println("Available tickets: " + Ticket.getAvailableTickets());
			System.out.println("Total amount:" + ticket.calculateTicketCost(noOfTickets));
			System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());
		}
		sc.close();
	}
}

import java.util.*;
public class Main
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Ticket obj = new Ticket();
        System.out.println("Enter the no of bookings:");
        int bookings=sc.nextInt();
        System.out.println("Enter the available tickets:");
        Ticket.setAvailableTickets(sc.nextInt());
        for(int i=1;i<=bookings;i++)
        {
            System.out.println("Enter the ticketid:");
            obj.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            obj.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int nooftickets=sc.nextInt();
            System.out.println("Available tickets: "+Ticket.getAvailableTickets());
            System.out.println("Total amount:"+obj.calculateTicketCost(nooftickets));
            System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
        }
        
    }
}
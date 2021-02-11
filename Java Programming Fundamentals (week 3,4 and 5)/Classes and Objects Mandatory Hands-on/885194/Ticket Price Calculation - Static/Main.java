import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Ticket ticket = new Ticket();
        
        System.out.println("Enter no of bookings:");
        int noOfBookings = sc.nextInt();
        
        System.out.println("Enter the available tickets:");
        int availableTickets = sc.nextInt();
        ticket.setAvailableTickets(availableTickets);
        
        while(noOfBookings-- != 0) {    
            System.out.println("Enter the ticketid:");
            int ticketId = sc.nextInt();
            ticket.setTicketid(ticketId);
            
            System.out.println("Enter the price:");
            int price = sc.nextInt();
            ticket.setPrice(price);
            
            System.out.println("Enter the no of tickets:");
            int noOfTickets = sc.nextInt();
            
            System.out.println("Available tickets: " + ticket.getAvailableTickets());
            int totalAmount = ticket.calculateTicketCost(noOfTickets);
            System.out.println("Total amount:" + totalAmount);
            System.out.println("Available ticket after booking:" + ticket.getAvailableTickets());
        }
    }
}
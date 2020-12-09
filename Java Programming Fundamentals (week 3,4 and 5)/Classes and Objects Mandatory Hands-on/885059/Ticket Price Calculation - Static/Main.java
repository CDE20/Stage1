import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int n = sc.nextInt();
        System.out.println("Enter the available tickets:");
        int totalTkt = sc.nextInt();
        Ticket tkt = new Ticket();
        tkt.setAvailableTickets(totalTkt);
        //System.out.println(tkt +" " +tkt.getAvailableTickets());
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the ticketid:");
            int tktId = sc.nextInt();
            tkt.setTicketid(tktId);
            System.out.println("Enter the price:");
            int price = sc.nextInt();
            tkt.setPrice(price);
            System.out.println("Enter the no of tickets:");
            int noOfTkt = sc.nextInt();
            System.out.println("Available tickets:"+tkt.getAvailableTickets());
            System.out.println("Total amount:"+tkt.calculateTicketCost(noOfTkt));
            System.out.println("Available ticket after booking:"+tkt.getAvailableTickets());
        }
    }
}
import java.util.*;

public class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket t=new Ticket();
        
        System.out.println("Enter no of bookings:");
        int n=sc.nextInt();
        System.out.println("Enter the available tickets:");
        int available=sc.nextInt();
        t.setAvailableTickets(available);
        
        int tid,price,noofticket;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the ticketid:");
            tid=sc.nextInt();
            t.setTicketid(tid);
            
            System.out.println("Enter the price:");
            price=sc.nextInt();
            t.setPrice(price);
            
            System.out.println("Enter the no of tickets:");
            noofticket=sc.nextInt();
           
            System.out.println("Available tickets:"+t.getAvailableTickets());
            
            int total=t.calculateTicketCost(noofticket);
            System.out.println("Total amount:"+total);
            
            System.out.println("Available tickets:"+t.getAvailableTickets());
            
        }
    }
}
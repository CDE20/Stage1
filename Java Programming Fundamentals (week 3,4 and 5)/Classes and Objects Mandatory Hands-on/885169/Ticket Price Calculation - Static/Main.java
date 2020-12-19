import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int noofbookings, tickets, ticketId, pri_ce, noOfTickets=0;
        
        System.out.println("Enter no of bookings:");
        noofbookings=sc.nextInt();
        System.out.println("Enter the available tickets:");
        tickets=sc.nextInt();
        for(int i=0;i<noofbookings;i++)
        {
        System.out.println("Enter the ticketid:");
        ticketId=sc.nextInt();
        System.out.println("Enter the price:");
        pri_ce=sc.nextInt();
        System.out.println("Enter the no of tickets:");
        noOfTickets=sc.nextInt();
        Ticket t=new Ticket();
        t.setTicketid(ticketId);
        t.setPrice(pri_ce);
        t.setAvailableTickets(tickets);
        
        int temp=t.calculateTicketCost(noOfTickets);
        if(temp==-1) System.out.println("Tickets not sufficient / available");
        else
        {
            System.out.println("Available tickets:"+tickets);
            System.out.println("Total amount:"+temp);
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
        }
        
        }
        
    }
}
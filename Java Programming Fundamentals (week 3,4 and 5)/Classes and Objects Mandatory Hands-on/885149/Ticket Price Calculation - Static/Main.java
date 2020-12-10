import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int noofbookings=sc.nextInt();
        Ticket tc=new Ticket();
        System.out.println("Enter the available tickets:");
        tc.setAvailableTickets(sc.nextInt());
        for(int i=0;i<noofbookings;i++){
            System.out.println("Enter the ticketid:");
            tc.setTicketid(sc.nextInt());
            System.out.println("Enter the price");
            tc.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int numoftickets=sc.nextInt();
            int total=tc.calculateTicketCost(numoftickets);
            System.out.println("Available tickets: "+tc.getAvailableTickets());
            
            System.out.println("Total amount:"+total);
            
            System.out.println("Available tickets after booking:"+tc.getAvailableTickets());
        }
    }
}
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Ticket obj=new Ticket();
        System.out.println("Enter no of bookings:");
        int booking=sc.nextInt();
        System.out.println("Enter the available tickets:");
        int availableTickets=sc.nextInt();
        for(int i=0;i<booking;i++){
            System.out.println("Enter the ticketid:");
            obj.setTicketid(sc.nextInt());
            System.out.println("Enter the price:");
            obj.setPrice(sc.nextInt());
            System.out.println("Enter the no of tickets:");
            int nooftickets=sc.nextInt();
            System.out.println("Available tickets: "+availableTickets);
            System.out.println("Total amount:"+obj.calculateTicketCost(nooftickets));
            System.out.println("Available ticket after booking:"+availableTickets);
        }
    }
}
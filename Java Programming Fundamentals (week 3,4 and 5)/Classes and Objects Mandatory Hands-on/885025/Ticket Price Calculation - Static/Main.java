import java.util.*;
public class Main{
    public static void main (String[] args) {
           Scanner sc=new Scanner(System.in);
           int av;
           System.out.println("Enter no of bookings:");
           int n=sc.nextInt();
           for(int i=1;i<=n;i++){
               Ticket t=new Ticket();
               if(i==1){
                   System.out.println("Enter the available tickets:");
                   Ticket.setAvailableTickets(sc.nextInt());
               }
               av=Ticket.getAvailableTickets();
               System.out.println("Enter the ticketid:");
               t.setTicketid(sc.nextInt());
               System.out.println("Enter the price:");
               t.setPrice(sc.nextInt());
               System.out.println("Enter the no of tickets:");
               int noft=sc.nextInt();
               int ta=t.calculateTicketCost(noft);
            System.out.println("Available tickets: "+av);
            System.out.println("Total amount:"+ta);
            System.out.println("Available ticket after booking:"+Ticket.getAvailableTickets());
               
           }
    }
}
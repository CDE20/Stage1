import java.util.*;
public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    public void setTicketid(int ticketid)
    {
        this.ticketid=ticketid;
    }
     public void setPrice(int price)
    {
        this.price=price;
    }
     public static void setAvailableTickets(int availableTickets)
    {   if(availableTickets>0)
             Ticket.availableTickets=availableTickets;
    }
     public int getTicketid()
    {
        return ticketid;
    }
    public int getPrice()
    {
        return price;
    }
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets){
        if(Ticket.availableTickets>0 && Ticket.availableTickets>=nooftickets){
            Ticket.availableTickets=Ticket.availableTickets-nooftickets;
            int totalamaount=nooftickets*price;
            return totalamaount;
        }
        else
           return -1;
    }
    
}
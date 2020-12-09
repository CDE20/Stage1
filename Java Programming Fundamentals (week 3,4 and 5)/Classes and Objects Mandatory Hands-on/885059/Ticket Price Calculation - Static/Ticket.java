public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public Ticket(){}
    
    public void setTicketid(int ticketid)
    {
        this.ticketid = ticketid;
    }
    
    public int getTicketid()
    {
        return ticketid;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public static void setAvailableTickets(int nooftickets)
    {
        if(nooftickets>0)
            availableTickets = nooftickets;
    }
    
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {
        if(nooftickets<=availableTickets)
        {
            availableTickets -= nooftickets;
            return nooftickets*price;
        }
        return -1;
    }
}
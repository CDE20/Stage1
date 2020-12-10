public class Ticket
{
    private int ticketid,price;
    private static int availableTickets;
    public void setTicketid(int ticketid)
    {
        this.ticketid=ticketid;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public static void setAvailableTickets(int availTickets)
    {
        if(availTickets>0)
        availableTickets=availTickets;
    }
    public int calculateTicketCost(int nooftickets)
    {
        if(availableTickets>0 && availableTickets>=nooftickets)
        {
            int totalAmt = nooftickets*price;
            availableTickets-=nooftickets;
            return totalAmt;
        }
        else
        return -1;
    }
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    public int getTicketid()
    {
        return ticketid;
    }
    public int getPrice()
    {
        return price;
    }
    
}
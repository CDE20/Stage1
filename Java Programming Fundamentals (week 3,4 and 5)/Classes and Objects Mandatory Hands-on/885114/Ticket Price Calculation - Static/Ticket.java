public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static int getAvailableTickets() {
        return availableTickets;
    }
    public static void setAvailableTickets(int availTickets) {
        if (availTickets > 0)
            availableTickets = availTickets;
    }
    
    public int calculateTicketCost(int nooftickets) {
        int totalCost = 0;
        if (nooftickets < availableTickets) {
            availableTickets -= nooftickets;
            
            totalCost = nooftickets * price;
        }
        else {
            totalCost = -1;
        }
        return totalCost;
    }
}
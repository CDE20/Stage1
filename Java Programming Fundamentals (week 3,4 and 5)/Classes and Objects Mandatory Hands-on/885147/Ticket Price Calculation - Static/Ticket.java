public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
   
    
    public int getTicketid(){
        return ticketid;
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    public static void setAvailableTickets(int count){
        if(count<=0)
         System.out.println("Available Tickets should be greater than 0");
        else 
         availableTickets=count;
    }
    
    public int calculateTicketCost(int nooftickets){
        if(nooftickets<=availableTickets){
            availableTickets -=nooftickets;
            return nooftickets*price;
        }
        else{
            return -1;
        }
    }
}
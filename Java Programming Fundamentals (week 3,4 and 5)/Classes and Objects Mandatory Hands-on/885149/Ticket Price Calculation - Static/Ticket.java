public class Ticket{
    private int ticketid,price;
    private static int availableTickets;
    
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public int getTicketid(){
        return this.ticketid;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    public static void setAvailableTickets(int available){
        if(available>0){
        availableTickets=available;
        }
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets){
        int total_amt=0;
        if(nooftickets<=this.availableTickets){
            total_amt=this.price*nooftickets;
            availableTickets=availableTickets-nooftickets;
            return total_amt;
        }
        else{
            return -1;
        }
    }
    
    
}
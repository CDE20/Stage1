public class Ticket {
    private int ticketid;
    private int price;
   private static int availableTickets;
   
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
   public void setTicketid(int id)
   {
       ticketid=id;
   }
   public void setPrice(int pri)
   {
       price=pri;
   }
   public static void setAvailableTickets(int available)
   {
      if(available>0)   
      {
          availableTickets=available;
      }
   }
   public int calculateTicketCost(int nooftickets)
   {
      int amount;
      if(availableTickets>=nooftickets)
      {
          availableTickets=availableTickets - nooftickets;
          amount  = nooftickets*price;
          return amount;
      }
      else
      return -1;
   }
}
public class Ticket
{
	private int ticketid,price;
	private static int availableTickets;
	public void setTicketid(int id)
	{
		this.ticketid = id;
	}
	public int getTicketid()
	{
		return this.ticketid;
	}
	public void setPrice(int p)
	{
		this.price = p;
	}
	public int getPrice() 
	{
		return this.price;
	}
	public static void setAvailableTickets(int tickets) 
	{
		if (tickets > 0)
		{
			availableTickets = tickets;
		}
	}
	public static int getAvailableTickets()
	{
		return availableTickets;
	}
	public int calculateTicketCost(int nooftickets) 
	{
		if (availableTickets >= nooftickets) {
			availableTickets -= nooftickets;
			return nooftickets * price;
		}
		return -1;
	}
}
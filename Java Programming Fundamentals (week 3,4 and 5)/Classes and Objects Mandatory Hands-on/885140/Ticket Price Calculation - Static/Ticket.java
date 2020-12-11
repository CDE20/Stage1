public class Ticket{
	
	private int ticketid,price;
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
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
			Ticket.availableTickets = availableTickets;
		else
			System.out.println("Available Tickets Should be equal to 1 or more");
	}
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets >=noOfTickets) {
			int calculatedPrice = noOfTickets * price;
			availableTickets -= noOfTickets;
			return calculatedPrice;
		}
		else
			return -1;
	}
	
	
}
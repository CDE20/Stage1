import java.net.CookieManager;
import java.util.Scanner;
public class UserInterface {
    
   public static void main(String args[]) {
        
    // Fill the code here
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no of passengers");
	   int n_tickets = sc.nextInt();
	   Ticket[] array  = new Ticket[n_tickets];
	   Ticket t ;
	   for(int i = 0;i < array.length;i++) {
		   t = new Ticket();
		   System.out.println("Details of Passenger "+(i+1) + ":");
		   System.out.println("Enter the pnr no:");t.setPnrNo(sc.nextLong());
		   System.out.println("Enter passenger name:");t.setPassengerName(sc.next());
		   System.out.println("Enter seat no:");t.setSeatNo(sc.nextInt());
		   System.out.println("Enter class type:");t.setClassType(sc.next());
		   System.out.println("Enter ticket fare:");t.setTicketFare(sc.nextDouble());
		   array[i] = t;
	   }
	   double commission = 0;
	   CommissionInfo c = generateCommissionObtained();
	   for(Ticket obj: array) {
		   commission += c.calculateCommissionAmount(obj);
	   }
	   System.out.println("Commission Obtained");
	   System.out.printf("Commission obtained per each person: Rs.%.2f",(commission));
    }
   public static CommissionInfo generateCommissionObtained() {
	   CommissionInfo c = (obj) -> {
		   double commission = 0;
		   if(obj.getClassType().equalsIgnoreCase("SL") || obj.getClassType().equalsIgnoreCase("2S"))
			   commission  = 60;
		   if(obj.getClassType().equalsIgnoreCase("1A") || obj.getClassType().equalsIgnoreCase("2A") || obj.getClassType().equalsIgnoreCase("3A"))
			   commission = 100;
		   return commission;
	   };
	   return c;
   }
    
}
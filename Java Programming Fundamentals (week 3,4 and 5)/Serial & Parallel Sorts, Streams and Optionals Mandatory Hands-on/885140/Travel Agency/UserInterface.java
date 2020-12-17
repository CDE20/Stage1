import java.util.Scanner;

public class UserInterface {
    
   public static void main(String args[]) {
        
    // Fill the code here
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the no of passengers");
	   int n = sc.nextInt();
	   Ticket arr[] = new Ticket[n];
	   Ticket T;
	   for(int i = 0;i<n;i++) {
		   System.out.println("Details of Passenger " + (i+1) + ":");
		   System.out.println("Enter the pnr no:");
		   long pnr = sc.nextLong();
		   System.out.println("Enter passenger name:");
		   sc.nextLine();
		   String name = sc.nextLine();
		   System.out.println("Enter seat no:");
		   int seatNo = sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter class type:");
		   String classType = sc.nextLine();
		   System.out.println("Enter ticket fare:");
		   double fare = sc.nextDouble();
		   T = new Ticket(pnr, name, seatNo, classType, fare);
		   arr[i] = T;
	   }
	   double totalCommission = 0;
	   for(int i = 0;i<arr.length;i++) {
		   CommissionInfo C = generateCommissionObtained();
		   totalCommission += C.calculateCommissionAmount(arr[i]);
	   }
	   
	   System.out.println("Commission Obtained");
	   System.out.print("Commission obtained per each person: Rs.");
	   System.out.printf("%.2f",totalCommission);
	   
    }
   
   public static CommissionInfo generateCommissionObtained() {
	   
	   CommissionInfo C = (ticket)->{
		   double d = 0;
		   if(ticket.getClassType().equalsIgnoreCase("1A") || ticket.getClassType().equalsIgnoreCase("2A") || ticket.getClassType().equalsIgnoreCase("3A"))
			   d = 100;
		   else if(ticket.getClassType().equalsIgnoreCase("SL") || ticket.getClassType().equalsIgnoreCase("2S"))
			   d = 60;
		   return d;
	   };
	   return C;
   }
    
}
import java.util.*;

public class UserInterface {
    
    
    public static CommissionInfo generateCommissionObtained(){
        CommissionInfo info = (obj)->{
        	double commission=0;
        	if(obj.getClassType().equalsIgnoreCase("SL") || obj.getClassType().equalsIgnoreCase("2S")) 
				commission = 60;
			if(obj.getClassType().equalsIgnoreCase("1A") || obj.getClassType().equalsIgnoreCase("2A") || obj.getClassType().equalsIgnoreCase("3A")) 
				commission = 100;
			return commission;
        };
        return info;
    }
    public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of passengers");
    int n=sc.nextInt();
    Ticket obj[]= new Ticket[n];
    for(int i=0;i<n;i++){
        System.out.println("Details of Passenger "+(i+1)+":");
        System.out.println("Enter the pnr no:");
        long pnrNo=sc.nextLong();
        System.out.println("Enter passenger name:");
        String name=sc.next();
        System.out.println("Enter seat no:");
        int seatNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter class type:");
        String classType=sc.nextLine();
        System.out.println("Enter ticket fare:");
        double ticketFare=sc.nextDouble();
        obj[i]=new Ticket(pnrNo,name,seatNo,classType,ticketFare);
        }
    	CommissionInfo ci = UserInterface.generateCommissionObtained();
    	double commission=0;
    	for(Ticket t:obj) {
    		commission += ci.calculateCommissionAmount(t);
    	}
    	System.out.println("Commission Obtained");
		System.out.printf("Commission obtained per each person: Rs.%.2f",commission);

    }
    
}
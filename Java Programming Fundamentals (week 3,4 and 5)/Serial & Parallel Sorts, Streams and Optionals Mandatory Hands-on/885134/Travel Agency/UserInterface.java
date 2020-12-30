import java.util.*;

public class UserInterface {
    
    public static CommissionInfo generateCommissionObtained ()
    {
        CommissionInfo commInfo=(t)->{
            double comm=0;
            if(t.getClassType().equalsIgnoreCase("SL") || t.getClassType().equalsIgnoreCase("2S")) 
				comm = 60;
			if(t.getClassType().equalsIgnoreCase("1A") || t.getClassType().equalsIgnoreCase("2A") || t.getClassType().equalsIgnoreCase("3A")) 
				comm = 100;
            return comm;
        };
        return commInfo;
    }
    
    public static void main(String args[]) {
        
    // Fill the code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int no=sc.nextInt();
        Ticket ticket[]=new Ticket[no];
        for(int i=0;i<no;i++)
        {
            System.out.println("Details of Passenger "+(i+1)+":");
            System.out.println("Enter the pnr no:");
            long prn=sc.nextLong();
            System.out.println("Enter passenger name:");
            String name=sc.next();
            System.out.println("Enter seat no:");
            int seatno=sc.nextInt();
            System.out.println("Enter class type:");
            String classt=sc.next();
            System.out.println("Enter ticket fare:");
            double fare=sc.nextDouble();
            
            ticket[i]=new Ticket(prn,name,seatno,classt,fare);
        }
        
        CommissionInfo info = generateCommissionObtained();
		double comm = 0;
		for(Ticket t: ticket)
		{
			comm += info.calculateCommissionAmount(t);
		}
		System.out.println("Commission Obtained");
		System.out.printf("Commission obtained per each person: Rs.%.2f", comm);
        
    }
    
}
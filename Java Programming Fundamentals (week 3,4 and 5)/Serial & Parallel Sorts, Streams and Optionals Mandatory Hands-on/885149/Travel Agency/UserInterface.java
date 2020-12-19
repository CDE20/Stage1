import java.util.*;
public class UserInterface {
    
    public static CommissionInfo generateCommissionObtained(){
        CommissionInfo cmi=(Ticket tobj)->{
            double commission=0;
            String type=tobj.getClassType();
            if(type.equalsIgnoreCase("SL")||type.equalsIgnoreCase("2S")){
                commission=60;
            }
            else if(type.equalsIgnoreCase("1A")||type.equalsIgnoreCase("2A")||type.equalsIgnoreCase("3A")){
                commission=100;
            }
            return commission;
        };
        return cmi;
    }
    
   public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc= new Scanner(System.in);
    ArrayList<Ticket> tlist = new ArrayList<>();
    double finalcommission=0;
    System.out.println("Enter the no of passengers");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        System.out.println("Details of Passenger "+i+":");
        System.out.println("Enter the pnr no:");
        long pnr=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter passenger name:");
        String name=sc.nextLine();
        System.out.println("Enter seat no:");
        int seat=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter class type:");
        String tickettype=sc.nextLine();
        System.out.println("Enter ticket fare:");
        double fare=sc.nextDouble();
        
        Ticket t = new Ticket(pnr,name,seat,tickettype,fare);
        tlist.add(t);
    }
    for(Ticket tic:tlist){
        CommissionInfo c=UserInterface.generateCommissionObtained();
        double addcom=c.calculateCommissionAmount(tic);
        finalcommission=finalcommission+addcom;
    }
    
    System.out.println("Commission Obtained");
    System.out.printf("Commission obtained per each person: Rs.%.2f",finalcommission);
    
    }
    
}
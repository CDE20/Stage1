import java.util.*;
public class UserInterface 
{
   public static void main(String args[])
   {
    // Fill the code here
     Scanner sc=new Scanner(System.in);
     double totalCommission=0;
     System.out.println("Enter the no of passengers");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     {
         System.out.println("Details of Passenger "+i+":");
         System.out.println("Enter the pnr no:");
         long pnr=sc.nextLong();
         System.out.println("Enter passenger name:");
         String passengerName=sc.next();
         System.out.println("Enter seat no:");
         int seatNo=sc.nextInt();
         System.out.println("Enter class type:");
         String classType=sc.next();
         System.out.println("Enter ticket fare:");
         double fare=sc.nextDouble();
         totalCommission=totalCommission+generateCommissionObtained().calculateCommissionAmount(new Ticket(pnr,passengerName,seatNo,classType,fare));
     }
     System.out.println("Commission Obtained");
     System.out.printf("Commission obtained per each person: Rs.%.2f",totalCommission);
     sc.close();
    }
    public static CommissionInfo generateCommissionObtained()
    {
        return (Ticket ticketObj) -> 
        {
            String classType=ticketObj.getClassType();
            if(classType.equalsIgnoreCase("1A")||classType.equalsIgnoreCase("2A")||classType.equalsIgnoreCase("3A"))
            {
                return 100;
            }
            else
            {
                if(classType.equalsIgnoreCase("SL")||classType.equalsIgnoreCase("2S"))
                {
                    return 60;
                }
            }
            return 0;
        };
    }
    
}
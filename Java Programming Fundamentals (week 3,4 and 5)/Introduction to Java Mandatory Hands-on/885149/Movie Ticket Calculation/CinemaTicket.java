import java.util.*;
public class CinemaTicket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int ticket_no=sc.nextInt();
         System.out.println();
        if(ticket_no>=5&&ticket_no<=40){
         sc.nextLine();
         System.out.print("Do you want refreshment:");
         String refersh=sc.nextLine();
         System.out.println();
         if(refersh.equalsIgnoreCase("y")||refersh.equalsIgnoreCase("n")){
             System.out.print("Do you have coupon code:");
             String code=sc.nextLine();
             System.out.println();
             if(code.equalsIgnoreCase("y")||code.equalsIgnoreCase("n")){
                 int refersh_cost=0;
                 if(refersh.equalsIgnoreCase("y")){
                     refersh_cost=50*ticket_no;
                 }
                 System.out.print("Enter the circle:");
                String circle=sc.nextLine();
                System.out.println();
                if(circle.equals("k")||circle.equals("q")){
                    double cost=0;
                    if(circle.equals("k")){
                        cost=75*ticket_no;
                    }
                    else if(circle.equals("q")){
                        cost=150*ticket_no;
                    }
                    double total=0;
                    double discount=0;
                    double code_discount=0;
                    if(ticket_no>20){
                        discount=10;
                    }
                    if(code.equalsIgnoreCase("y")){
                        code_discount=2;
                    }
                    total=cost;
                    total=total-((cost*discount)/100);
                    total=total-((total*code_discount)/100);
                    total=total+refersh_cost;
                    System.out.printf("Ticket cost:%.2f",total);
                }
                else{
                System.out.println("Invalid Input");
                }
                 
             }
             else{
             System.out.println("Invalid Input code");
         }
             
         }
         else{
             System.out.println("Invalid Input referh");
         }
         
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
        
    }
    
}
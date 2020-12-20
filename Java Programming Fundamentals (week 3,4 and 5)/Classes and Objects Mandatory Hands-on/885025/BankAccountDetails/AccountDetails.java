import java.util.*;
public class AccountDetails{
    Scanner sc=new Scanner(System.in);
    public Account getAccountDetails(){
           Account a = new Account();
           System.out.println("Enter account id:");
           int id = sc.nextInt();
           
           System.out.println("Enter account type:");
           String type = sc.next();
           while(true){
               System.out.println("Enter balance:");
                int bal = sc.nextInt();
                if(bal<=0){
                    System.out.println("Balance should be positive");
                }
                else{
                    a.setBalance(bal);
                    break;
                }
           }
           a.setAccountId(id);
           a.setAccountType(type);
           
           return a;
          
       }
    
    public int getWithdrawAmount(){
        System.out.println("Enter amount to be withdrawn:");
        int wa=sc.nextInt();
        while(wa<=0){
            System.out.println("Amount should be positive");
            System.out.println("Enter amount to be withdrawn:");
            wa=sc.nextInt();
        }
        
        return wa;
    }
    public static void main (String[] args) {
        
        AccountDetails ad=new AccountDetails();
        Account na = ad.getAccountDetails();
        int mwa = ad.getWithdrawAmount();
        na.withdraw(mwa);
    }
}
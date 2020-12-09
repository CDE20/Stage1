import java.util.*;

public class AccountDetails {
    private final Scanner sc = new Scanner(System.in);
    public Account getAccountDetails()
    {
        System.out.println("Enter account id:");
        int id = sc.nextInt();
        System.out.println("Enter account type:");
        String type = sc.next();
        int bal;
        do{
            System.out.println("Enter balance:");
            bal = sc.nextInt();
            if(bal<=0)
                System.out.println("Balance should be positive");
        } while(bal<=0);
        Account acc = new Account();
        acc.setAccountId(id);
        acc.setAccountType(type);
        acc.setBalance(bal);
        return acc;
    }
    
    public int getWithdrawAmount() {
        sc.nextLine();
        int amount;
        do {
            System.out.println("Enter amount to be withdrawn:");
            amount = sc.nextInt();
            if(amount<=0)
                System.out.println("Amount should be positive");
        }while(amount<=0);
        return amount;
    }
    public static void main (String[] args) {
        
        AccountDetails details = new AccountDetails();
        Account a = details.getAccountDetails();
        int amountToWithdraw = details.getWithdrawAmount();
        a.withdraw(amountToWithdraw);
        
    }
}
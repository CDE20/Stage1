import java.util.Scanner;

public class AccountDetails {
    
    public Account getAccountDetails() {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        
        System.out.println("Enter account id");
        account.setAccountId(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Enter account type:");
        account.setAccountType(sc.nextLine());
        
        System.out.println("Enter balance:");
        
        int balance = 0;
        while ((balance = Integer.parseInt(sc.nextLine())) <= 0) {
        	System.out.println("Balance should be positive");
        	System.out.println("Enter balance:");
        }
        account.setBalance(balance);
        
		return account;
    }
    
    public int getWithdrawAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        int amount = 0;
        while ((amount = Integer.parseInt(sc.nextLine())) <= 0) {
        	System.out.println("Amount should be positive");
        	System.out.println("Enter amount to be withdrawn:");
        }
		return amount;
    }
    
    public static void main (String[] args) {
    	AccountDetails ad = new AccountDetails();
    	Account account = ad.getAccountDetails();
    	
    	int amount = ad.getWithdrawAmount();
    	account.withdraw(amount);
    }
}
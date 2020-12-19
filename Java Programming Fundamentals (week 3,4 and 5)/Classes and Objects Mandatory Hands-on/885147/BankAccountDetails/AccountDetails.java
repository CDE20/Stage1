import java.util.*;

public class AccountDetails{
	
	Scanner sc=new Scanner(System.in);
	
    public static void main(String args[]){
        AccountDetails acc = new AccountDetails();
        Account a = acc.getAccountDetails();
        int amount = acc.getWithdrawAmount();
        a.withdraw(amount);
    }
    public Account getAccountDetails(){
        
        Account a=new Account();
        System.out.println("Enter account id:");
        int accountId=sc.nextInt();
        
        System.out.println("Enter account type:");
        String accountType=sc.next();
        
        int balance;
        int check=0;
        do{
        	System.out.println("Enter balance:");
            balance=sc.nextInt();
        	if(balance<=0) {
        		System.out.println("Balance should be positive");
            }	   
            else {
        	     check=1;
             }
         }while(check==0);
        a.setAccountId(accountId);
        a.setAccountType(accountType);
        a.setBalance(balance);
        return a;
    }
    
    public int getWithdrawAmount() {
    	int amount;
    	int flag=0;
    	do {
    		System.out.println("Enter amount to be withdrawn:");
    		amount=sc.nextInt();
    		if(amount <= 0) {
    			System.out.println("Amount should be positive");
    		}
    		else {
    			flag=1;
    		}
    	}while(flag==0);
    	
    	return amount;
    }
}
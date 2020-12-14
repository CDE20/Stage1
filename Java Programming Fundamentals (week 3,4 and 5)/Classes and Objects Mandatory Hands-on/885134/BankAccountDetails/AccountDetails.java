import java.util.*;

public class AccountDetails {
	
	public static Account getAccountDetails()
	{
		Scanner sc=new Scanner(System.in);
		
		 int accid;
		 String acctype;
		 int bal=0;
		
		Account a1=new Account();
		
		System.out.println("Enter account id:");
		accid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account type:");
		acctype=sc.nextLine();
		
		do {
			System.out.println("Enter balance:");
			bal=sc.nextInt();
			
			if(bal<=0) {
				System.out.println("Balance should be positive");
			}
			else {
				break;
			}
		}while(true);
		
		a1.setAccountId(accid);
		a1.setAccountType(acctype);
		a1.setBalance(bal);
		
		return a1;
	}
	public static int getWithdrawAmount() 
	{
		Scanner sc=new Scanner(System.in);
		
		int amtwith=0;
		
		do {
			System.out.println("Enter amount to be withdrawn:\n");
			amtwith=sc.nextInt();
			 if(amtwith<=0)
			 {
				 System.out.println("Amount should be positive");
			 }
			 else {
				 break;
			 }
		}while(true);
		
		
		return amtwith;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a3=null;
		
		a3=getAccountDetails();
		int amount=getWithdrawAmount();
		boolean res=a3.withdraw(amount);
		
	}

}

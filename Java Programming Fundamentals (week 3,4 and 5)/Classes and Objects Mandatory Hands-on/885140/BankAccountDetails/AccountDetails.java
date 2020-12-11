import java.util.Scanner;

public class AccountDetails{
	
	
	
	public static void main(String[] args) {
		
		Account A = getAccountDetails();
		int amount = getWithdrawAmount();
		A.withdraw(amount);	
	}
	
	public static Account getAccountDetails() {
		Scanner sc = new Scanner(System.in);	
	Account A = new Account();
	System.out.println("Enter account id:");
	A.setAccountId(sc.nextInt());
	System.out.println("Enter account type:");
	sc.nextLine();
	A.setAccountType(sc.nextLine());

	while(true) {
		System.out.println("Enter balance:");
		int balance = sc.nextInt();
		if(balance>0) {
			A.setBalance(balance);
			break;}
		else 
		System.out.println("Balance should be positive");
	}
	
	return A;
	}
	public static int getWithdrawAmount() {
		Scanner sc = new Scanner(System.in);	
		int amount = 0;
		while(true) {
			System.out.println("Enter amount to be withdrawn:");
			amount = sc.nextInt();
			if(amount>0) {
				break;
			}
			else {
				System.out.println("Amount should be positive");
			}
			
			
				
	}
		return amount;
	}
}
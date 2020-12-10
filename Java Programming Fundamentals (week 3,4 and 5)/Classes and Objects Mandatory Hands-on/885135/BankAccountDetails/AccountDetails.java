import java.util.Scanner;

public class AccountDetails {
		
		public static void main(String[] args) {
			AccountDetails d=new AccountDetails();
			Account acc;
			acc=d.getAccountDetails();
			int amount=d.getWithdrawAmount();
			acc.withdraw(amount);
		}
		
		public Account getAccountDetails() {
			Scanner sc=new Scanner(System.in);
			Account acc=new Account();
			System.out.println("Enter account id:");
			acc.setAccountId(sc.nextInt());
			System.out.println("Enter account type:");
			acc.setAccountType(sc.next());
			System.out.println("Enter balance:");
			int balance=sc.nextInt();
			while(balance<=0) {
				System.out.println("Balance should be positive");
				System.out.println("Enter balance:");
				balance=sc.nextInt();
			}
			acc.setBalance(balance);
			return acc;
			
		}
		
		public int getWithdrawAmount() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount to be withdrawn:");
			int amount=sc.nextInt();
			while(amount<=0) {
				System.out.println("Amount should be positive");
				System.out.println("Enter amount to be withdrawn:");
				amount=sc.nextInt();
			}
			return amount;
		}
}

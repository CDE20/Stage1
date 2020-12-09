import java.util.Scanner;
public class AccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = getAccountDetails();
		int amount = getWithdrawAmount();
		ac.withdraw(amount);
	}
	public static Account getAccountDetails(){
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id:");
		ac.setAccountId(sc.nextInt());
		System.out.println("Enter account type:");
		ac.setAccountType(sc.next());
		int balance,i=0;
		do{
		if(i > 0)
			System.out.println("Balance should be positive");
		System.out.println("Enter balance:");
		balance = sc.nextInt();
		i++;
		}while(balance <= 0);
		ac.setBalance(balance);
		return ac;
	}
	public static int getWithdrawAmount(){
		Scanner sc = new Scanner(System.in);
		int amount,i=0;
		do{
		if(i > 0)
			System.out.println("Amount should be positive");
		System.out.println("Enter amount to be withdrawn:");
		amount = sc.nextInt();
		i++;
		}while(amount <= 0);
		return amount;
	}
}

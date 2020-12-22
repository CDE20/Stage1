import java.util.*;
public class AccountDetails
{
	public static void main(String args[])
	{
		Account account = getAccountDetails();
		account.withdraw(getWithdrawAmount());
	}
	public static Account getAccountDetails() 
	{
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		System.out.println("Enter account id:");
		account.setAccountId(sc.nextInt());
		System.out.println("Enter account type:");
		account.setAccountType(sc.next());
		while (true)
		{
			System.out.println("Enter balance:");
			int balance = sc.nextInt();
			if (balance > 0) 
			{
				account.setBalance(balance);
				break;
			}
			System.out.println("Balance should be positive");
		}
		sc.close();
		return account;
	}
	public static int getWithdrawAmount() 
	{
		Scanner sc = new Scanner(System.in);
		int amount;
		while (true)
		{
			System.out.println("Enter amount to be withdrawn:");
			amount = sc.nextInt();
			if (amount > 0) 
			{
				break;
			}
			System.out.println("Amount should be positive");
		}
		sc.close();
		return amount;
	}
}
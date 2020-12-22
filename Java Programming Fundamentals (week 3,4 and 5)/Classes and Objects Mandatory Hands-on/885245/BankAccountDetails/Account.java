public class Account
{
    private int accountId;
    private String accountType;
    private int balance;
public void setAccountId(int id)
{
    this.accountId=id;
}
public int getAccountId()
{
    return accountId;
}
public void setAccountType(String Type)
{
    this.accountType=Type;
}
public String getAccountType()
{
    return accountType;
}
public void setBalance(int bal)
{
    this.balance=bal;
}
public int getBalance()
{
    return balance;
}
public boolean withdraw(int amount)
{
		if (amount <= balance)
		{
			balance=balance-amount;
			System.out.println("Balance amount after withdraw: " + balance);
			return true;
		}
		System.out.println("Sorry!!! No enough balance");
		return false;
}
}
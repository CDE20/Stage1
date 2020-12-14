public class Account{
    private int accountId;
    private int balance;
    private String accountType;
    
    public Account()
    {
        
    }
    public Account(int accountId,String accountType,int balance)
    {
        this.accountId=accountId;
        this.accountType=accountType;
        this.balance=balance;
    }
    
    public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public boolean withdraw(int amount)
	{
	    if(balance>=amount)
	    {
	        balance = balance - amount;
	        System.out.println("Balance amount after withdraw: "+balance);
	        return true;
	    }
	    else
	    {
	        System.out.println("Sorry!!! No enough balance");
	        return false;
	    }
	}
}

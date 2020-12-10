public class Account {
    private int accountId;
    private String accountType;
    private int balance;
    
    public void setAccountId(int accountId)
    {
        this.accountId = accountId;
    }
    
    public int getAccountId()
    {
        return this.accountId;    
    }
    
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    
    public String getAccountType()
    {
        return this.accountType;    
    }
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
    
    public int getBalance()
    {
        return this.balance;    
    }
    
    public boolean withdraw(int amount)
    {
        if(amount<=balance)
        {
            balance -= amount;
            System.out.println("Balance amount after withdraw: "+balance);
            return true;
        }
        System.out.println("Sorry!!! No enough balance");
        return false;
    }
}
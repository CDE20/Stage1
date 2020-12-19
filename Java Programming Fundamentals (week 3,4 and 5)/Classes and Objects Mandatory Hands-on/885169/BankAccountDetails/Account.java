public class Account{
    private int accountId;
    private String accountType;
    private int balance;
    
    public int getAccountId()
    {
        return accountId;
    }
    public String getAccountType()
    {
        return accountType;
    }
    
    public int getBalance()
    {
        return balance;
    }
    public void setAccountId(int accountid)
    {
        this.accountId=accountid;
    }
    public void setAccountType(String accountType)
    {
        this.accountType=accountType;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    
    public boolean withdraw(int amount)
    {
        if(this.balance>=amount)
        {
             this.balance=balance-amount;
             System.out.println("Balance amount after withdraw:+this.balance");
             return true;
        }     
        System.out.println("Sorry!!! No enough balance");
        return false;
        
    
        
        
        }
    }
    

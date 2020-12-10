public class Account{
    private int accountId,balance;
    private String accountType;
    
    public void setAccountId(int id){
        this.accountId=id;
    }
    public int getAccountId(){
        return this.accountId;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setAccountType(String type){
        this.accountType=type;
    }
    public String getAccountType(){
        return this.accountType;
    }
    
    public boolean withdraw(int amount){
        if(amount<=this.balance){
            this.balance=this.balance-amount;
            System.out.println("Balance amount after withdraw:"+this.balance);
            return true;
        }
        else{
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
    }
    
}
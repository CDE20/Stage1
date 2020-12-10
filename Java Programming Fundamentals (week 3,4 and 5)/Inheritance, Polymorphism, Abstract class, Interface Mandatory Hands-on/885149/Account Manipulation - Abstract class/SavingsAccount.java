public class SavingsAccount extends Account{
    private double minimumBalance;

    //Uncomment the getters and setters after writing the attributes

    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    
    public SavingsAccount(int accountNumber,Customer customerObj,double balance,double minimumBalance){
        super(accountNumber,customerObj,balance);
        this.minimumBalance=minimumBalance;
    }
    
    public boolean withdraw(double amount)
    {
        double check=this.balance-amount;
        if(check>this.minimumBalance){
            this.balance=this.balance-amount;
            return true;
        }
        else{
            return false;
        }
    }
}

    
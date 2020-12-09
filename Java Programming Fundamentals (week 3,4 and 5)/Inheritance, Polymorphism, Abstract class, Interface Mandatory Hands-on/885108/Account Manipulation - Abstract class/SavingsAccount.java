public class SavingsAccount extends Account{

    private double minimumBalance;

    //Uncomment the getters and setters after writing the attributes
    public SavingsAccount(int accountNumber,Customer obj,double balance,double minimumBalance){
        super(accountNumber,obj,balance);
        this.minimumBalance = minimumBalance;
    }
    
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	public boolean withdraw(double amount){
	    double after_withdraw = (balance - amount);
	    if(after_withdraw > minimumBalance){
	        balance -= amount;
	        return true;
	    }
	   return false;
	}
    
}
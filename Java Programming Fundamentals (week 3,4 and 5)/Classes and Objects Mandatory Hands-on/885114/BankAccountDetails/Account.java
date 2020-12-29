
public class Account {
    private int accountId;
    private String accountType;
    private int balance;
    
    public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean withdraw(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Balance amount after withdraw: " + balance);
        }
        else {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }
        return true;
    }
}

public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount = 0;
		if(employeeObj instanceof PermanentEmployee) {
			loanAmount = 0.15 * employeeObj.getSalary();
		}
		if(employeeObj instanceof TemporaryEmployee) {
			loanAmount = 0.10 * employeeObj.getSalary();
		}
		return loanAmount;
	}

}

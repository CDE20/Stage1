
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount=0;
		if(employeeObj instanceof PermanentEmployee) {
			loanAmount = 0.15 * employeeObj.salary;
		}
		else {
			loanAmount = 0.10 * employeeObj.salary;
		}
		return loanAmount;
	}

}

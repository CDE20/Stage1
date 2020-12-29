
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	    double amount = 0;
		if (employeeObj instanceof PermanentEmployee) {
		    amount = 0.15 * employeeObj.salary;
		}
		if (employeeObj instanceof TemporaryEmployee) {
		    amount = 0.10 * employeeObj.salary;
		}
		
		return amount;
	}

}

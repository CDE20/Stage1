
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double amount=0;
		if(employeeObj instanceof PermanentEmployee) 
			amount = employeeObj.getSalary() * 15/100;
		else if(employeeObj instanceof TemporaryEmployee)
			amount = employeeObj.getSalary() * 10/100;
	
		
		return amount;
	}

}

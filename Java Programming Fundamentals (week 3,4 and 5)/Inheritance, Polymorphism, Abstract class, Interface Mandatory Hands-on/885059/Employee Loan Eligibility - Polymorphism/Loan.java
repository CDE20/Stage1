
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double amount = 0;
		if(employeeObj instanceof PermanentEmployee)
		{
			amount = employeeObj.salary*0.15;
		}
		else if(employeeObj instanceof TemporaryEmployee)
		{
			amount = employeeObj.salary*0.1;
		}
		return amount;
	}

}

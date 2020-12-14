
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount;
		if(employeeObj instanceof PermanentEmployee)
		{
		    double sal=employeeObj.getSalary();
		    loanAmount=0.15*sal;
		    return loanAmount;
		}
		else
		{
		    double sal=employeeObj.getSalary();
		    loanAmount=0.10*sal;
		    return loanAmount;
		}
	}
	

}

public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount=0;
		if(employeeObj.getClass().getName()=="PermanentEmployee") {
			loanAmount= 0.15*employeeObj.getSalary();
		}else if(employeeObj.getClass().getName()=="TemporaryEmployee") {
			loanAmount=0.1*employeeObj.getSalary();
		}
		return loanAmount;
	}

}
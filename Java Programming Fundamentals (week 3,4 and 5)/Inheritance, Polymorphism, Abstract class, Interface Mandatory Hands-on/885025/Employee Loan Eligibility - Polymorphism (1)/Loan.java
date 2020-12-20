
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	    double la,sal;
	    if( employeeObj instanceof PermanentEmployee){
	        sal=employeeObj.getSalary();
	        la=(15* sal)/100;
	    }
	    else {
	        sal=employeeObj.getSalary();
	        la=(10*sal)/100;
	    }
	 return la;	
	}

}

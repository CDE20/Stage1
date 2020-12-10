
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	   double sal= employeeObj.getSalary();
	   double loan=0;
	   if(employeeObj instanceof PermanentEmployee){
	       loan=(sal*15)/100;
	   }
	   
	   if(employeeObj instanceof TemporaryEmployee){
	       loan=(sal*10)/100;
	   }
	   return loan;
		
	}

}

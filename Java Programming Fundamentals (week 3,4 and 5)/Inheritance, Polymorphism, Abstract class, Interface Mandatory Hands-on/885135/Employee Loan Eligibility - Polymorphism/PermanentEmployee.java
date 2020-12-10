public class PermanentEmployee extends Employee
{
  

private double basicPay;
  
  // Getters and Setters
	
  public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	
  
  //1. Write a public 3 argument constructor with arguments – employeeId, employeeName and basicPay.  
  
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		// TODO Auto-generated constructor stub
	}
  
	
	//2. Implement the  - public void calculateSalary() - method   
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double PF = basicPay * 0.12;
		salary = basicPay-PF;
		this.setSalary(salary);
	}
  
  
}
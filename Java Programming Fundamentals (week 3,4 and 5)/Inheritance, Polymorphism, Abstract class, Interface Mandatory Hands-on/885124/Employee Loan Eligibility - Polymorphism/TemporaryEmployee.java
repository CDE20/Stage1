//Make this class inherit the Employee class

public class TemporaryEmployee extends Employee{
	
	
	private int  hoursWorked;
	private int hourlyWages;
	
	// Getters and Setters
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	
	//1. Write a public 4 argument constructor with arguments â€“ employeeId, employeeName, hoursWorked and hourlyWages.  
	
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId, employeeName);
		this.hourlyWages= hourlyWages;
		this.hoursWorked = hoursWorked;
	}
	
	
	//2. Implement the  - public void calculateSalary() - method  
	
	@Override
	public void calculateSalary() {
		super.salary = hoursWorked * hourlyWages;
		super.setSalary(salary);
	}
	
}

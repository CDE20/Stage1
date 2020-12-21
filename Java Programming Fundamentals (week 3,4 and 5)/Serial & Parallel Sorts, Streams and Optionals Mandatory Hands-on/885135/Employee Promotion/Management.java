import java.util.*;
public class Management extends Thread{
	private double salaryLimit;
	private List<Employee> employeeList=new ArrayList<Employee>();
	private int count;
	public Management(double salaryLimit, List<Employee> employeeList) {
		super();
		this.salaryLimit = salaryLimit;
		this.employeeList = employeeList;
	}
	public double getSalaryLimit() {
		return salaryLimit;
	}
	public void setSalaryLimit(double salaryLimit) {
		this.salaryLimit = salaryLimit;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void run()
	{
	    //Fill the code
		int temp=0;
		for(Employee e : this.getEmployeeList()) {
			if(e.getEmpSalary()>=this.getSalaryLimit()) {
				temp++;
			}
		}
		this.setCount(temp);
	}
}


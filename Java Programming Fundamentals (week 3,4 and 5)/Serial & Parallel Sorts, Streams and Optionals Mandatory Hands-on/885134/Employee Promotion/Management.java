import java.util.*;

public class Management extends Thread {
	private double salaryLimit;
	private List<Employee> employeeList;
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

	public void run() {
		count = 0;
		for(Employee e: employeeList)
		{
			if(e.getEmpSalary()>=salaryLimit)
				count++;
		}
	}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Main {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name=  new ArrayList<>();
		EmployeeAudit e = (salary) -> {
			for(Map.Entry<String, Double> m : employeeMap.entrySet())
				if(m.getValue() <= salary)
					name.add(m.getKey());
			return name;
		};
	    return e;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int choice;
		String name;
		double salary;
		Main m = new Main();
		do{
			System.out.println("1. Add Employee Details\n2. Find Employee Details\n3. Exit\nEnter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter the Employee name");
			name = sc.next();
			System.out.println("Enter the Employee Salary");
			salary = sc.nextDouble();
			m.addEmployeeDetails(name, salary);
				break;
			case 2:System.out.println("Enter the salary to be searched");
			salary = sc.nextDouble();
			EmployeeAudit emp = findEmployee();
			ArrayList<String> nameBySalary = emp.fetchEmployeeDetails(salary);
			if(!nameBySalary.isEmpty()) {
				System.out.println("Employee List");
				for(String s : nameBySalary) {
					System.out.println(s);
				}
			}	
			else
				System.out.println("No Employee Found");
				break;
			case 3:System.out.println("Let's complete the session");
				break;
			}
		}while(choice != 3);
	}

}

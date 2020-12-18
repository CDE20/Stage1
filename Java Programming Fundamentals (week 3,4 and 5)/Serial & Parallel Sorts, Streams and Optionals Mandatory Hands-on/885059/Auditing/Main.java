import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		// Fill the code
		employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name=new ArrayList<>();
		// Fill the code
		EmployeeAudit ea = (salary)->{
			for(String n: employeeMap.keySet())
			{
				if(employeeMap.get(n)<=salary)
					name.add(n);
			}
			return name;
		};
		return ea;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		// Fill the code
		int option = 0;
		Main main = new Main();
		
		do {
			System.out.println("1.Add Employee Details\n" + 
					"2.Find Employee Details\n" + 
					"3.Exit\n" + 
					"Enter the choice");
			option = sc.nextInt();
			switch(option)
			{
			case 1://add
				System.out.println("Enter the Employee name");
				String name = sc.next();
				System.out.println("Enter the Employee Salary");
				double salary = sc.nextDouble();
				main.addEmployeeDetails(name, salary);
				break;
			case 2://display
				System.out.println("Enter the salary to be searched");
				double sal = sc.nextDouble();
				EmployeeAudit ea = findEmployee();
				List<String> names = ea.fetchEmployeeDetails(sal);
				if(names.size()>0)
				{
					
					System.out.println("Employee List");
					for(String s: names)
					{
						System.out.println(s);
					}
				}
				else
				{
					System.out.println("No Employee Found");
				}
			case 3:
				System.out.println("Let's complete the session");
				break;
			}
		} while(option!=3);
	}

}

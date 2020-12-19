import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		Main.employeeMap.put(employeeName, salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name=new ArrayList<>();
		// Fill the code
		EmployeeAudit audit = (sal)->{
			for(String s:employeeMap.keySet()) {
				if(employeeMap.get(s)<=sal) {
					name.add(s);
				}
			}
			return name;
		};
		return audit;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		// Fill the code
		do {
		System.out.println("1.Add Employee Details");
		System.out.println("2.Find Employee Details");
		System.out.println("3.Exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Employee name");
			String empName=sc.next();
			System.out.println("Enter the Employee Salary");
			double salary=sc.nextDouble();
			Main m=new Main();
			m.addEmployeeDetails(empName, salary);
			break;
		case 2:
			System.out.println("Enter the salary to be searched");
			salary = sc.nextDouble();
			ArrayList<String> list = Main.findEmployee().fetchEmployeeDetails(salary);
			if(list.isEmpty()) {
				System.out.println("No Employee Found");
			}
			else {
				System.out.println("Employee List");
				for(String name:list) {
					System.out.println(name);
				}
			}
			break;
		case 3:
			System.out.println("Let's complete the session");
			System.exit(0);
		}
	  }while(true);
	}

}

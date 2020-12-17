import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap=new HashMap<String, Double>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
		setEmployeeMap(employeeMap);
		
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		//Map<String, Double> emp = getEmployeeMap();
		ArrayList<String> name=new ArrayList<String>();;
		// Fill the code
	
		EmployeeAudit e=(sal)->{
			
			
			for(Map.Entry<String,Double> entry:employeeMap.entrySet()) {
				if(entry.getValue()<=sal) {
				name.add(entry.getKey());
				}
			}
			return name;
			
			
		};
		
		//e.fetchEmployeeDetails(salary);
		return e;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		// Fill the code
		int ch;
		String name;
		Double salary;
		do{
			System.out.println(
				"1.Add Employee Details\n" + 
				"\n" + 
				"2.Find Employee Details\n" + 
				"\n" + 
				"3.Exit\n" + 
				"");
			System.out.println("Enter the choice");
			ch=sc.nextInt();
			sc.nextLine();
			Main m=new Main();
			switch(ch) {
			
			
			case 1: System.out.println("Enter the Employee name");
			
					name=sc.nextLine();
					System.out.println("Enter the Employee Salary");
					salary=sc.nextDouble();
					m.addEmployeeDetails(name, salary);
					break;
			case 2:	System.out.println("Enter the salary to be searched");
					salary=sc.nextDouble();
					EmployeeAudit e = Main.findEmployee();
					ArrayList<String> fetch = e.fetchEmployeeDetails(salary);
					for(String s:fetch) {
						System.out.println(s);
					}
					break;
			case 3 : System.out.println("Let's complete the session");
					System.exit(0);
					break;
					
			
			}
			
			
			
			
		}while(ch>0&&ch<4);
		sc.close();	
	}

}

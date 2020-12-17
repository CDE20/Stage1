import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	private static Map<String, Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}

	public void addEmployeeDetails(String employeeName, double salary) {
		// Fill the code
		employeeMap.put(employeeName, salary);
	}

	public static EmployeeAudit findEmployee() {
		ArrayList<String> name = new ArrayList<>();
		EmployeeAudit E = (s) -> {

			for (Entry<String, Double> entry : employeeMap.entrySet()) {
				if (entry.getValue()<=s)
					name.add(entry.getKey());

			}
			return name;
		};
		return E;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println("1. Add Employee Details\n2. Find Employee Details\n3. Exit");
			System.out.println("Enter the choice");
			option = sc.nextInt();
			sc.nextLine();
			Main M = new Main();
			double salary;
			String name;
			switch (option) {

			case 1:
				System.out.println("Enter the Employee name");
				name = sc.nextLine();
				System.out.println("Enter the Employee Salary");
				salary = sc.nextDouble();
				M.addEmployeeDetails(name, salary);
				break;

			case 2:
				System.out.println("Enter the salary to be searched");
				salary = sc.nextDouble();
				EmployeeAudit E = findEmployee();
				ArrayList<String> employeeList = E.fetchEmployeeDetails(salary);
				if(employeeList.isEmpty())
					System.out.println("No Employee Found");
				else {
				System.out.println("Employee List");
				for (String string : employeeList) {
					System.out.println(string);
				}
				}
				break;
			default:
				System.out.println("Let's complete the session");
				break;
			}
		} while (option != 3);
		// Fill the code
	}

}

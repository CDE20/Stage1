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
		// Fill the code
		EmployeeAudit ea = i -> {

			for (Entry<String, Double> entry : employeeMap.entrySet()) {
				if (i >= entry.getValue()) {
					name.add(entry.getKey());
				}
			}

			return name;
		};

		return ea;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Fill the code

		Main main = new Main();
		int choice = 0;
		while (choice != 3) {
			System.out.println("1.Add Employee details");
			System.out.println("2.Find Employee details");
			System.out.println("3.Exit");

			System.out.println("Enter the choice");
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {
				System.out.println("Enter the Employee name");
				String employeeName = sc.nextLine();
				System.out.println("Enter the Employee Salary");
				double salary = Double.parseDouble(sc.nextLine());

				main.addEmployeeDetails(employeeName, salary);
			}
			if (choice == 2) {
				System.out.println("Enter the salary to be searched");
				double salary = Double.parseDouble(sc.nextLine());

				EmployeeAudit findEmployee = Main.findEmployee();
				ArrayList<String> fetchEmployeeDetails = findEmployee.fetchEmployeeDetails(salary);

				if (fetchEmployeeDetails.isEmpty()) {
					System.out.println("No Employee Found");
				}
				else {
					for (String name : fetchEmployeeDetails) {
						System.out.println(name);
					}						
				}
			}
			if (choice == 3) {
				System.out.println("Let's complete the session");
			}
		}
	}

}

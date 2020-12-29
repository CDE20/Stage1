import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		// Fill your code here
		Employee[] employees = new Employee[details.length];

		for (int i = 0; i < details.length; i++) {
			String string = details[i];
			String[] split = string.split(";");
			Employee employee = new Employee();
			employee.setEmpId(split[0]);
			employee.setEmpName(split[1]);
			employee.setSalary(Double.parseDouble(split[2]));

			employees[i] = employee;
		}

		return employees;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		// Fill your code here
		Stream<Employee> stream = Arrays.stream(empDetails);

		return stream;
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {

		// Fill your code here
		String[] array = empStream.filter(i -> i.getSalary() >= minSalary)
			.map(i->i.getEmpId() + " " + i.getEmpName() + " " + i.getSalary())
			.sorted().toArray(String[]::new);
		
		return array;
	}

}

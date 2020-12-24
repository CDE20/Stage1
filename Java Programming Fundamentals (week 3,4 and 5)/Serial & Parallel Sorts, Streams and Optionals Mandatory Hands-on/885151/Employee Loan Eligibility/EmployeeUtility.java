import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		// Fill your code here
		Employee[] empArr = new Employee[details.length];
		for (int i = 0; i < details.length; i++) {
			String[] temp = details[i].split(";");
			empArr[i] = new Employee();
			empArr[i].setEmpId(temp[0]);
			empArr[i].setEmpName(temp[1]);
			empArr[i].setSalary(Double.parseDouble(temp[2]));
		}
		return empArr;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		// Fill your code here
		List<Employee> empList = Arrays.asList(empDetails);
		return empList.stream();
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {

		// Fill your code here
		List<String> sortedList = empStream.filter((e) -> e.getSalary() >= minSalary).sorted((e1, e2)->e1.getEmpId().compareTo(e2.getEmpId()))
				.map(e -> e.getEmpId() + " " + e.getEmpName() + " " + e.getSalary()).collect(Collectors.toList());
		String[] sortedArray = new String[sortedList.size()];
		sortedArray = sortedList.toArray(sortedArray);
		return sortedArray;
	}

}

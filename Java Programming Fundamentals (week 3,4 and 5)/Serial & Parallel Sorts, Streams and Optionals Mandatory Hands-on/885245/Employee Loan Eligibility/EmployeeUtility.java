import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
public class EmployeeUtility
{
	public Employee[] getEmployeeDetails(String[] details) 
	{
		// Fill your code here
		List<Employee> empList = new ArrayList<Employee>();
		Stream.of(details).forEach(emp -> {
			String[] empDetails = emp.split(";");
			Employee empObj = new Employee();
			empObj.setEmpId(empDetails[0]);
			empObj.setEmpName(empDetails[1]);
			empObj.setSalary(Double.parseDouble(empDetails[2]));
			empList.add(empObj);
		});
		return empList.stream().toArray(Employee[]::new);
	}
	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) 
	{
		// Fill your code here
		return Stream.of(empDetails);
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary)
	{
		// Fill your code here
		Stream<Employee> shortlistedStream = empStream.filter(emp -> emp.getSalary() >= minSalary);
		List<String> shortlist = new ArrayList<String>();
		shortlistedStream.forEach(emp -> {
			shortlist.add(emp.getEmpId() + " " + emp.getEmpName() + " " + emp.getSalary());
		});
		Collections.sort(shortlist);
		return shortlist.stream().toArray(String[]::new);
	}
}

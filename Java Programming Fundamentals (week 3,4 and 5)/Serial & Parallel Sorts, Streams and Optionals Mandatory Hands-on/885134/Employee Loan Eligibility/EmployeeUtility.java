import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		Employee[] emp=new Employee[details.length];
		for(int i=0;i<details.length;i++) {
			String arr[]=details[i].split(";");
			
			emp[i]=new Employee();
			emp[i].setEmpId(arr[0]);
			emp[i].setEmpName(arr[1]);
			emp[i].setSalary(Double.parseDouble(arr[2]));
		}
		return emp;

	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
		Stream<Employee> emp=Arrays.stream(empDetails);
		return emp;


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		
		
		List<String> sortedList = empStream.filter((e) -> e.getSalary() >= minSalary).sorted((e1, e2)->e1.getEmpId().compareTo(e2.getEmpId()))
				.map(e -> e.getEmpId() + " " + e.getEmpName() + " " + e.getSalary()).collect(Collectors.toList());
		String[] sortedArray = new String[sortedList.size()];
		sortedArray = sortedList.toArray(sortedArray);
		return sortedArray;

	}

}


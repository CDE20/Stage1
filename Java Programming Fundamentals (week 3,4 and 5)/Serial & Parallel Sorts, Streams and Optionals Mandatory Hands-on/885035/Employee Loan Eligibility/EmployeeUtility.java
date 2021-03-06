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
		//System.out.println("Details length"+details.length);
		Employee[] emp=new Employee[details.length];
		for(int i=0;i<details.length;i++) {
			String arr[]=details[i].split(";");
			//System.out.println("Arr "+arr[0]+arr[1]+arr[2]);
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
		//Comparator<Employee> comp=(e1,e2)->e1.getSalary().compareTo(e2.getSalary());
		
		List<String> sortedList = empStream.filter((e) -> e.getSalary() >= minSalary).sorted((e1, e2)->e1.getEmpId().compareTo(e2.getEmpId()))
				.map(e -> e.getEmpId() + " " + e.getEmpName() + " " + e.getSalary()).collect(Collectors.toList());
		String[] sortedArray = new String[sortedList.size()];
		sortedArray = sortedList.toArray(sortedArray);
		return sortedArray;
		//String[] strings = Arrays.stream(obj).map(Object::toString). toArray(String[]::new);


	}

}


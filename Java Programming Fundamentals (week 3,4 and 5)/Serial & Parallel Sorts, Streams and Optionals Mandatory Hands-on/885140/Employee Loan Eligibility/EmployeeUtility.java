import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		// Fill your code here
		Employee[] arr = new Employee[details.length];
		Employee E;
		String[] split;
		for (int i = 0; i < details.length; i++) {

			split = details[i].split(";");
			E = new Employee();
			E.setEmpId(split[0]);
			E.setEmpName(split[1]);
			E.setSalary(Double.parseDouble(split[2]));
			arr[i] = E;
		}

		return arr;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		// Fill your code here
		List<Employee> list = Arrays.asList(empDetails);
		Stream<Employee> stream = list.stream();
		return stream;

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		Comparator<Employee> comp = (i1,i2)->
		{
			return i1.getEmpId().compareTo(i2.getEmpId());
			
		};
		 List<Employee> list = empStream.filter(E->E.getSalary()>=minSalary).sorted(comp).collect(Collectors.toList());
		 String[] employee = new String[list.size()];
		 int i = 0;
		 for (Employee E : list) {
			employee[i] =E.getEmpId() + " " + E.getEmpName() +" " +E.getSalary() ;
			i++;
		}
		 return employee;

	}

}

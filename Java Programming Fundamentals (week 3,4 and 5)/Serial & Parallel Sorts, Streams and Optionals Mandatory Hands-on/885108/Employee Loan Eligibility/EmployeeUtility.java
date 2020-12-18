import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		int i = 0;
		String[] splitted;
		Employee[] array = new Employee[details.length];
		Employee e;
		for(String s : details){
		    e = new Employee();
		    splitted = s.split(";");
		    e.setEmpId(splitted[0]);
		    e.setEmpName(splitted[1]);
		    e.setSalary(Double.parseDouble(splitted[2]));
		    array[i++] = e;
		}
        return array;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
		List<Employee> list = Arrays.asList(empDetails); 
        return list.stream();
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		List<Employee> list = empStream.collect(Collectors.toList());
		Map<String,String> finale = new TreeMap<String,String>();
		for(Employee e : list) {
			if(e.getSalary() >= minSalary) {
				finale.put(e.getEmpId(),e.getEmpId()+" "+e.getEmpName()+" "+String.format("%.1f", e.getSalary()));
			}
		}
		
		String[] result  = new String[finale.size()];
		int i = 0;
		for(Map.Entry<String,String> m: finale.entrySet()) {
			result[i++] = m.getValue();
		}
		return result;
	}

}

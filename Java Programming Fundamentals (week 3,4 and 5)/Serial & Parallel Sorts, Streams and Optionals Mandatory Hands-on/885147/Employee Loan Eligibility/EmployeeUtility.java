import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		Employee[] employeeArray=new Employee[details.length]; 
		//Fill your code here
		for(int i=0;i<details.length;i++)
		{
			Employee e=new Employee();
			String[] split=details[i].split(";");
			e.setEmpId(split[0]);
			e.setEmpName(split[1]);
			e.setSalary(Double.parseDouble(split[2]));
			employeeArray[i]=e;
		}
		return employeeArray;



	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		return Arrays.stream(empDetails);

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		
		//Comparator.comparing(Employee::getEmpId
		Employee[] e=empStream.filter(employee->employee.getSalary()>=minSalary)
				.sorted(Comparator.comparing(Employee::getEmpId)).toArray(Employee[]::new);
				//.forEach(e->System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary()));
		
		String[] shortlistedEmployee=new String[e.length];
		
		for(int i=0;i<shortlistedEmployee.length;i++)
		{
			shortlistedEmployee[i]=e[i].getEmpId()+" "+e[i].getEmpName()+" "+e[i].getSalary();
		}
		return shortlistedEmployee;



	}

}
import java.util.stream.Stream;
import java.util.*;
public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		Employee emp[] = new Employee[details.length];
		for(int i=0;i<details.length;i++){
		    Employee e = new Employee();
		    String str[]=details[i].split(";");
		    e.setEmpId(str[0]);
		    e.setEmpName(str[1]);
		    double sal=Double.parseDouble(str[2]);
		    e.setSalary(sal);
		    emp[i]=e;
		}
		return emp;
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
		return Stream.of(empDetails);


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		//Compartor<Employee> cmp=(e1,e2)->e1.getSalary().compareTo(e2.getSalary());
		Employee eshort[] = empStream.filter(e->e.getSalary()>=minSalary).sorted((emp1, emp2)->emp1.getEmpId().compareTo(emp2.getEmpId())).toArray(Employee []::new);
		String names[]= new String[eshort.length];
		for(int j=0;j<eshort.length;j++){
		    Employee e=eshort[j];
		    String s=e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary();
		    names[j]=s;
		}
		return names;





	}

}

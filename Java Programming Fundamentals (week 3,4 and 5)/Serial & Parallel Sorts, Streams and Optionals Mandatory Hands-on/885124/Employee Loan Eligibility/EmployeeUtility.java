
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		Employee e[] = new Employee[details.length];
		
		for(int i=0;i<details.length;i++) {
		String splitDetails[] = details[i].split(";");
		
		Employee emp = new Employee();
		emp.setEmpId(splitDetails[0]);
		emp.setEmpName(splitDetails[1]);
		emp.setSalary(Double.parseDouble(splitDetails[2]));
		e[i]=emp;
		
		}
	
		
		return e;


	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
		
		Stream<Employee> s = Arrays.stream(empDetails);

		return s;

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here

		 ArrayList<String> name=new ArrayList<>();

		   empStream.forEach(a -> 
		   {
		    if(a.getSalary()>=minSalary)
		    {
		      DecimalFormat df = new DecimalFormat("#.0");
		         String sal = df.format(a.getSalary());
		     name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
		    }
		   });
		   
		   String x[]=new String[name.size()];
		   for(int i=0;i<x.length;i++)
		   {
		    x[i]=name.get(i);
		   }
		   Arrays.sort(x);
		   return x;

		
	}

}

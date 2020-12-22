import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap;

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
	   return(salary) -> { ArrayList<String> employees= new ArrayList<String>();
	   for(Map.Entry<String, Double> employee : employeeMap.entrySet())
	   {
	       if(employee.getValue() <= salary)
	       {
	           employees.add(employee.getKey());
	       }
	     }
	     return employees;
	   };
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Main m= new Main();
		m.setEmployeeMap(new HashMap<String, Double>());
		while(true)
		{
		    System.out.println("1.Add Employee Details");
		    System.out.println("2.Find Employee Details");
		    System.out.println("3.Exit");
		    System.out.println("Enter the choice");
		    int c=sc.nextInt();
		    if(c==1)
		    {
		        System.out.println("Enter the Employee Name");
		        String employeeName=sc.next();
		        System.out.println("Enter the Employee Salary");
		        double Salary=sc.nextDouble();
		        m.addEmployeeDetails(employeeName,Salary);
		    }
		    else if(c==2)
		    {
		        System.out.println("Enter the salary to be searched");
		        double Salary=sc.nextDouble();
		        ArrayList <String> employees = findEmployee().fetchEmployeeDetails(Salary);
		       if(!employees.isEmpty())
		       {
		        for(String employee : employees)
		        {
		            System.out.println(employee);
		        }
		        continue;
		       }
		      System.out.println("No Employee Found");
		    }
		    else if(c==3)
		    {
		        System.out.println("Let's complete the session");
		        System.exit(0);
		    }
		}
	}

}

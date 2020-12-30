import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

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
		ArrayList<String> name=new ArrayList<String>();
		// Fill the code
		EmployeeAudit empAudit= (sal)->{
		    for(Entry<String,Double> entry: employeeMap.entrySet())
		    {
		        if(entry.getValue()<=sal)
		        {
		            name.add(entry.getKey());
		        }
		    }
		    return name;
		};
		return empAudit;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		Main m=new Main();
		Map<String,Double> map=new HashMap<>();
		m.setEmployeeMap(map);
		// Fill the code
		
		int ch=0;
		do 
		{
		    System.out.println("1.Add Employee Details");
		    System.out.println("2.Find Employee Details");
		    System.out.println("3.Exit");
		    System.out.println("Enter the choice");
		    ch=sc.nextInt();
		    switch(ch)
		    {
		        case 1:
		                System.out.println("Enter the Employee name");
		                String name=sc.next();
		                System.out.println("Enter the Employee Salary");
		                double salary=sc.nextDouble();
		                m.addEmployeeDetails(name,salary);
		                break;
		                
		        case 2:
		                System.out.println("Enter the salary to be searched");
		                salary=sc.nextDouble();
		                
		                ArrayList<String> list=Main.findEmployee().fetchEmployeeDetails(salary);
		                if(list.isEmpty())
		                {
		                    System.out.println("No Employee Found");
		                }
		                else
		                {
		                    System.out.println("Employee List");
		                    for(String str:list)
		                    {
		                        System.out.println(str);
		                    }
		                }
		                break;
		              
		          case 3:
		                System.out.println("Let's complete the session");
		                System.exit(0);
		    }
		}while(true);
	}

}
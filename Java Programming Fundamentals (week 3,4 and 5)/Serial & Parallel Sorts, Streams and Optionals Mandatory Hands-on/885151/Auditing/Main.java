import java.util.*;
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
		Main.employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		
		ArrayList<String> name=new ArrayList<String>();
		EmployeeAudit audit =(sal)->{
		    for(Map.Entry<String, Double> entry: employeeMap.entrySet()){
		        if(entry.getValue()<=sal){
		            name.add(entry.getKey());
		        }
		    }
		    return name;
		};
		return audit;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do{
		    System.out.println("1.Add Employee Details\r\n"+"\r\n"+
		                        "2.Find Employee Details\r\n"+"\r\n"+
                                "3.Exit\r\n"+"\r\n"+
                                "Enter the Employee name");
            choice=sc.nextInt();
            
            
            switch(choice){
                case 1:
                System.out.println("Enter the Employee name");
                String name=sc.next();
                System.out.println("Enter the Employee Salary");
                double salary=sc.nextDouble();
                Main obj=new Main();
                obj.addEmployeeDetails(name,salary);
                break;
                
                case 2:
                System.out.println("Enter the salary to be searched");
                salary=sc.nextDouble();
                ArrayList<String> list=Main.findEmployee().fetchEmployeeDetails(salary);
                if(list.isEmpty()){
                    System.out.println("No Employee Found");
                }else{
                    System.out.println("Employee List");
                    for(String str:list){
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

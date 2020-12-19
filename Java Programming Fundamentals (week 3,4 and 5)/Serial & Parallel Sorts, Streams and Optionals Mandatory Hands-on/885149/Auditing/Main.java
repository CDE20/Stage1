//package lambdaDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		Main.employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
	    //Scanner sc= new Scanner(System.in);
		ArrayList<String> name=new ArrayList<String>();
		// Fill the code
		//@SuppressWarnings("null")
		//Map<String,Double> map= employeeMap;
		EmployeeAudit ea= (sal)->{
		    for(String nm:employeeMap.keySet()){
		        double empsal=employeeMap.get(nm);
		        if(empsal<=sal){
		            name.add(nm);
		        }
		    }
		    return name;
		};
		
		
		return ea;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		Main m=new Main();
// 		Map<String,Double> emap
// 		m.setEmployeeMap(emap);
		while(flag){
		System.out.println("1. Add Employee details");
		System.out.println("2. Find Employee details");
		System.out.println("3. Exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		    case 1:
		        sc.nextLine();
		        System.out.println("Enter the Employee name");
		        String n=sc.nextLine();
		        System.out.println("Enter the Employee Salary");
		        double sal=sc.nextDouble();
		        m.addEmployeeDetails(n,sal);
		        break;
            case 2:
                sc.nextLine();
                System.out.println("Enter the salary to be searched");
		        double salsearch=sc.nextDouble();
		        ArrayList<String> empnames=Main.findEmployee().fetchEmployeeDetails(salsearch);
		        //EmployeeAudit empaudit=
		        //empnames=empaudit.
		        if(empnames.isEmpty()){
		            System.out.println("No Employee Found");
		        }
		        else{
		            System.out.println("Employee list");
		        for(String nm:empnames){
		            System.out.println(nm);
		        }
		        }
		        break;
		  case 3:
		      flag=false;
		      System.out.println("Let's complete the session");
		}
		}
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=sc.nextInt();
		List<Employee> list=new ArrayList<Employee>();
		System.out.println("Enter the employee details");
		for(int i=0;i<n;i++) {
			
			String str=sc.next();
			String arr[]=str.split(":");
			Employee emp=new Employee(arr[0], arr[1], Double.parseDouble(arr[2]));
			//System.out.println(emp);
			list.add(emp);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		n=sc.nextInt();
		Management[] managementArray=new Management[n]; 
		String array[]=new String[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the salary limit to be searched");
			double salaryLimit=sc.nextDouble();
			Management m=new Management(salaryLimit, list);
			m.start();
			m.join();
			int count=m.getCount();
			double salary=m.getSalaryLimit();
			array[i]=salary+" : "+count;
		}
		for(String str : array) {
			System.out.println(str);
		}
		//fill the code
}
}

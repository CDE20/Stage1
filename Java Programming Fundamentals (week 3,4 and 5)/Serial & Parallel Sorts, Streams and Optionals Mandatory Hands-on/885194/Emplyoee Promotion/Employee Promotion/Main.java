import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		ArrayList<Employee> empList = new ArrayList<>();
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		System.out.println("Enter the employee details");
		for(int i=0; i<n; i++)
		{
			String inp = sc.next();
			String[] details = inp.split(":");
			Employee e = new Employee(details[0], details[1], Double.parseDouble(details[2]));
			empList.add(e);
		}
		ArrayList<Management> mgtList = new ArrayList<>();
		System.out.println("Enter the number of times salary limit to be searched");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the salary limit to be searched");
			double salLimit = sc.nextDouble();

			Management mgt = new Management(salLimit, empList);
			mgt.start();
			mgt.join();
			mgtList.add(mgt);
		}
		
		for(Management m: mgtList)
		{
			System.out.println(m.getSalaryLimit() + " : "+m.getCount());
		}
}
}

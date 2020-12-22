import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
    	// fill the code
		System.out.println("Enter the number of employees");
		int num = sc.nextInt();
		System.out.println("Enter the employee details");
		List<Employee> empList = new ArrayList<Employee>();
		while (num-- > 0)
		{
			String[] empDetails = sc.next().split(":");
			empList.add(new Employee(empDetails[0], empDetails[1], Double.parseDouble(empDetails[2])));
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int times = sc.nextInt();
		Management[] threadArray = new Management[times];
		for (int i = 0; i < times; i++) {
			System.out.println("Enter the salary limit to be searched");
			double limit = sc.nextDouble();
			threadArray[i] = new Management(limit, empList);
		}
		for (Management thread : threadArray) 
		{
			thread.start();
			try 
			{
				thread.join();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		sc.close();
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//fill the code
		Scanner sc=new Scanner(System.in);
		List<Employee> employee = new LinkedList<Employee>();
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		System.out.println("Enter the employee details");
		sc.nextLine();
		String[] split;
		Employee E;
		for(int i = 0;i<n;i++) {
			String line = sc.nextLine();
			split = line.split(":");
			E = new Employee(split[0],split[1],Double.parseDouble(split[2]));
			employee.add(E);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int salaryLimit = sc.nextInt();
		Management[] arr = new Management[salaryLimit];
		Management M;
		for(int i = 0;i<salaryLimit;i++) {
			System.out.println("Enter the salary limit to be searched");
			double salary = sc.nextDouble();
			M = new Management(salary, employee);
			M.start();
			try {
				M.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			arr[i] = M;
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.format("%.1f",arr[i].getSalaryLimit());
			System.out.println(":" + arr[i].getCount());
		
		}
		
}
}

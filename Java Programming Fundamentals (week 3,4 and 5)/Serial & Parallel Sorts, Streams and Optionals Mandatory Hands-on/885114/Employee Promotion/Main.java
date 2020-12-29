import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n = Integer.parseInt(sc.nextLine());

		System.out.println("Enter the employee details");
		List<Employee> employees = new ArrayList<>();

		while (n-- > 0) {
			String input = sc.nextLine();
			String[] details = input.split(":");

			Employee employee = new Employee(details[0], details[1], Double.parseDouble(details[2]));
			employees.add(employee);
		}

		System.out.println("Enter the number of times salary limit to be searched");
		n = Integer.parseInt(sc.nextLine());


		double[] limits = new double[n];
		int[] counts = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the salary limit to be searched");
			int limit = Integer.parseInt(sc.nextLine());
			Management m = new Management(limit, employees);
			m.start();
			try {
				m.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			limits[i] = m.getSalaryLimit();
			counts[i] = m.getCount();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(limits[i] + " : " + counts[i]);
		}
	}
}

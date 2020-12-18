import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n_employees,n_search;
		Employee e;
		List<Employee> list = new ArrayList<>();
		System.out.println("Enter the number of employees");
		n_employees = sc.nextInt();
		System.out.println("Enter the employee details");
		String input;
		String[] splitted;
		for(int i = 0;i < n_employees;i++){
			input = sc.next();
			splitted = input.split(":");
			e = new Employee(splitted[0], splitted[1], Double.parseDouble(splitted[2]));
			list.add(e);
		}
		
		System.out.println("Enter the number of times salary limit to be searched");n_search = sc.nextInt();
		Management[] manage = new Management[n_search];
		Management m;
		for(int i = 0;i < n_search;i++) {
			System.out.println("Enter the salary limit to be searched");
			m = new Management(sc.nextDouble(), list);
			m.setCount(0);
			m.start();
			try{m.join();
			}catch(Exception ae) {
				System.out.println(ae);
			}manage[i] = m;
		}
		
		for(Management obj: manage) {
			System.out.printf("%.1f : %d\n",obj.getSalaryLimit(),obj.getCount());
		}
	}
}

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee details");
		List<Employee> list=new ArrayList<>();
		for(int i=0;i<n;i++){
		    String input = sc.nextLine();
		    String empDetails[] = input.split(":");
		    Employee employee = new Employee(empDetails[0],empDetails[1],Double.parseDouble(empDetails[2]));
		    list.add(employee);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int no = sc.nextInt();
		
		double[] limits = new double[no];
		int[] count = new int[no];
		
		for(int i=0;i<no;i++){
		    System.out.println("Enter the salary limit to be searched");
		    int limit = sc.nextInt();
		    Management m = new Management(limit,list);
		    m.start();
		    try{
		        m.join();
		    }catch(Exception e){
		        e.printStackTrace();
		    }
		    
		    limits[i]=m.getSalaryLimit();
		    count[i]=m.getCount();
		}
		
		for(int i=0;i<no;i++){
		    System.out.println(limits[i] + " : " + count[i]);
		}

}
}

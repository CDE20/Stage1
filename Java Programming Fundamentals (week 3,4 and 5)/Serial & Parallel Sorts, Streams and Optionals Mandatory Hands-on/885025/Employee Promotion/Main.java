import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String arr[] =new String[3];
		String s = "";
		
		List<Employee> list = new ArrayList<>();
		//fill the code
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		Management m[] = new Management[n];
		sc.nextLine();
		System.out.println("Enter the employee details");
		for(int i=0;i<n;i++){
		    s = sc.next();
		    arr = s.split(":");
		    Employee eo = new Employee(arr[0],arr[1],Double.parseDouble(arr[2]));
		    list.add(eo);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++){
		        System.out.println("Enter the salary limit to be searched");
		        double sallimit = sc.nextDouble();
		        
		         m[i]= new Management(sallimit,list);
		        m[i].start();
		        m[i].join();
		}
		for(int i=0;i<n1;i++){
		    System.out.println(m[i].getSalaryLimit()+" : "+m[i].getCount());
		}
		
}
}

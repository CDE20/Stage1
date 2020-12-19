import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the employee details");
		String arr[] = new String[3];
		List<Employee> emlist=new ArrayList<>();
		 List<Management> marray=new ArrayList<>();
		for(int i=0;i<n;i++){
		    String details=sc.nextLine();
		    arr=details.split(":");
		    //System.out.println(arr[2]);
		    arr[2]=arr[2].trim();
		    double ss=Double.parseDouble(arr[2]);
		    Employee e= new Employee(arr[0],arr[1],ss);
		    emlist.add(e);
		}
		System.out.println("Enter the number of times salary limit to be searched");
		int numThread=sc.nextInt();
		//sc.nextLine();
		
		
		for(int j=0;j<numThread;j++){
		    System.out.println("Enter the Salary limit to be searched");
		    double s=sc.nextDouble();
		    //sc.nextLine();
		    Management mt= new Management(s,emlist);
		    mt.start();
		    try{
		    synchronized(mt){
		        mt.wait();
		    marray.add(mt);
		    }
		    }catch(InterruptedException e){
		        System.out.println("fff");
		    }
		}
		for(Management m:marray){
		    System.out.println(m.getSalaryLimit()+" : "+m.getCount());
		}
}
}

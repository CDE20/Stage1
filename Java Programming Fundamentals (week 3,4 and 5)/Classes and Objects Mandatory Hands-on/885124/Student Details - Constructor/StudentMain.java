import java.util.*;

public class StudentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int id;
		String name,address,college,collegeName;
		
		System.out.println("Enter Student's Id:");
		id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Student's Name:");
		name = sc.nextLine();
		
		System.out.println("Enter Student's address:");
		address = sc.nextLine();
		
		
		
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			college = sc.nextLine();
			
			if(college=="yes" || college=="YES") {
				Student s = new Student(id,name,address);
				
				System.out.println("Student id:"+id);
				System.out.println("Student name:"+name);
				System.out.println("Address:"+address);
				System.out.println("College name:NIT");
				break;
			}
			
			else if(college.equals("NO") || college.equals("no")) {
				
				System.out.println("Enter the college name:");
				collegeName = sc.nextLine();
				
				Student st = new Student(id,name,address,collegeName);
				System.out.println("Student id:"+id);
				System.out.println("Student name:"+name);
				System.out.println("Address:"+address);
				System.out.println("College name:"+collegeName);
				break;
			}
			
			else
			{
				System.out.println("Wrong Input");
			}
		}
		
	}

}

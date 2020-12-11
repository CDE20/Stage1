import java.util.Scanner;

public class StudentMain{
	
	public static void main(String[] args) {
		
		Student student = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Id:");
		int id = sc.nextInt();
		System.out.println("Enter Student's Name:");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter Student's Address:");
		String address = sc.nextLine();
		String response = "";
		while(true) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			response = sc.nextLine();
			if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("no"))
				break;
			else
				System.out.println("Wrong Input");
			
		}
		if(response.equalsIgnoreCase("yes")) {
			student = new Student(id,name,address);
		}
		else if(response.equalsIgnoreCase("no")) {
			System.out.println("Enter the college name:");
			String collegeName = sc.nextLine();
			student = new Student(id,name,address,collegeName);
		}
		
		System.out.println("Student id:" + student.getStudentId());
		System.out.println("Student name:" + student.getStudentName());
		System.out.println("Address:" + student.getStudentAddress());
		System.out.println("College name:" + student.getCollegeName());
	}
}
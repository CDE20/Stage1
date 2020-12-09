import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int id;
		String name,address,from_NIT;
		System.out.println("Enter Student's Id:");
		id = sc.nextInt();
		System.out.println("Enter Student's Name:");
		name = sc.next();
		System.out.println("Enter Student's address:");
		address = sc.next();
		int i  = 0;
		do {
		if(i > 0) {
			System.out.println("Wrong Input");
		}
		System.out.println("Whether the student is from NIT(Yes/No):");
		from_NIT = sc.next();
		i++;
		}while(!from_NIT.equalsIgnoreCase("YES") && !from_NIT.equalsIgnoreCase("NO"));
		Student s;
		if(from_NIT.equalsIgnoreCase("YES"))
			s = new Student(id, name, address);
		else {
			System.out.println("Enter the college name:");
			String clg_name = sc.next();
			s = new Student(id, name, address, clg_name);
		}
		System.out.println("Student id:"+s.getStudentId()+"\nStudent name:"+s.getStudentName()+"\nAddress:"+s.getStudentAddress()+"\nCollege name:"+s.getCollegeName());
		sc.close();
	}

}

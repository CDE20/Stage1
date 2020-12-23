import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int studentId;
		String studentName, studentAddress, collegeName;
		Student s;
		System.out.println("Enter Student's Id:");
		studentId=sc.nextInt();
		System.out.println("Enter Student's Name:");
		studentName=sc.next();
		System.out.println("Enter Student's address:");
		studentAddress=sc.next();
		System.out.println("Whether the student is from NIT(Yes/No):");
		String ans=sc.next();
		while(!ans.equals("no")&&!ans.equals("NO")&&!ans.equals("yes")&&!ans.equals("YES")) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			ans=sc.next();
		}
		
		if(ans.equals("no")||ans.equals("NO")) {
			System.out.println("Enter the college name:");
			collegeName=sc.next();
			s=new Student(studentId,studentName,studentAddress,collegeName);
		}
		else {
			s=new Student(studentId,studentName,studentAddress);
		}
		System.out.println("Student id:"+s.getStudentId());
		System.out.println("Student name:"+s.getStudentName());
		System.out.println("Address:"+s.getStudentAddress());
		System.out.println("College name:"+s.getCollegeName());
	}
}

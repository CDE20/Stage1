import java.util.Scanner;
public class StudentMain {
    public static void displayStudentDetails(Student student) {
        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        
        System.out.println("Enter Student's Name:");
        String studentName = sc.next();
        
        System.out.println("Enter Student's address:");
        String studentAddress = sc.next();
        
        System.out.println("Whether the student is from NIT(Yes/No)");
        String yesNo = sc.next();
        
        yesNo = yesNo.toLowerCase();
        Student student = null;
        if (yesNo == "yes") {
            student = new Student(studentId, studentName, studentAddress);
        } else {
            System.out.println("Enter the college name:");
            String collegeName = sc.nextLine();
            student = new Student(studentId, studentName, studentAddress, collegeName);
        }
        
        displayStudentDetails(student);

    }
}
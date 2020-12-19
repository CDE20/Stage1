import java.util.*;
public class StudentMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String studentName=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Student's address:");
        String studentAddress=sc.nextLine();
        String choice;
        do{
            System.out.println("Whether the student is from NIT(Yes/No):");
            choice=sc.nextLine();
            
            if(choice.equalsIgnoreCase("yes")){
                Student s1=new Student(studentId,studentName,studentAddress);
                System.out.println("Student id:"+s1.getStudentId());
                System.out.println("Student name:"+s1.getStudentName());
                System.out.println("Student Address:"+s1.getStudentAddress());
                System.out.println("College name:"+s1.getCollegeName());
            }
            else if(choice.equalsIgnoreCase("no")){
                System.out.println("Enter the college name:");
                String collegeName=sc.nextLine();
                Student s2=new Student(studentId,studentName,studentAddress,collegeName);
                System.out.println("Student id:"+s2.getStudentId());
                System.out.println("Student name:"+s2.getStudentName());
                System.out.println("Student Address:"+s2.getStudentAddress());
                System.out.println("College name:"+s2.getCollegeName());
            }
            else{
                System.out.println("Wrong Input");
            }
        }while(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")));
        
        
    }
}
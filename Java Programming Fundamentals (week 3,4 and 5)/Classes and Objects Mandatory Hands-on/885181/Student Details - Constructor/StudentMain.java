import java.util.*;
public class StudentMain{
    public static void main(String[] args)
    {
        int studentId;
        String studentName,studentAddress,collegeName;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id");
        studentId=sc.nextInt();
        
        System.out.println("Enter Student's Name");
        studentName=sc.nextLine();
        
        System.out.println("Enter Student's address");
        studentAddress=sc.nextLine();
        
        System.out.println("Whether the student is from NIT(Yes/No");
        collegeName=sc.nextLine();
        
        if(collegeName=="yes" || collegeName=="Yes" || collegeName=="YES")
        {
             Student obj=new Student(studentId,studentName,studentAddress);
             
              System.out.println("Student id:"+obj.getStudentId());
              System.out.println("Student name:"+obj.getStudentName());
              System.out.println("Student id:"+obj.getStudentAddress());
              System.out.println("college name:"+obj.getCollegeName());
            
        }
       else if(collegeName=="no" || collegeName=="No" || collegeName=="NO"){
           Student obj=new Student(studentId,studentName,studentAddress,collegeName);
             
              System.out.println("Student id:"+obj.getStudentId());
              System.out.println("Student name:"+obj.getStudentName());
              System.out.println("Student id:"+obj.getStudentAddress());
              System.out.println("college name:"+obj.getCollegeName());
           
       }
       else{
            System.out.println("Wrong Input");
       }
       
        
        
        
        
        
        
    }
}
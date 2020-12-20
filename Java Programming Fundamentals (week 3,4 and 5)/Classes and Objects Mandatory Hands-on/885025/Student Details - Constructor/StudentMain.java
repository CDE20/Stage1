import java.util.*;
public class StudentMain{
    
    public static void main (String[] args) {
        Student s;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Student's Id:");
       int si=sc.nextInt();
       System.out.println("Enter Student's Name:");
       String n=sc.nextLine();
       System.out.println("Enter Student's address:");
       String a=sc.nextLine();
       System.out.println("Whether the student is from NIT(Yes/No):");
       String yn=sc.nextLine().toLowerCase();
       while(yn!="no" || yn!="yes"){
           System.out.println("Wrong Input");
           System.out.println("Whether the student is from NIT(Yes/No):");
            yn=sc.nextLine().toLowerCase();
       }
      
      if(yn=="yes"){
           s=new Student(si,n,a);
           System.out.println("Student id:"+s.getStudentId());
      System.out.println("Student name:"+s.getStudentName());
      System.out.println("Address:"+s.getStudentAddress());
      System.out.println("College name:"+s.getCollegeName());
      }
      else if(yn=="no"){
          System.out.println("Enter the college name:");
          String cn=sc.nextLine();
           s=new Student(si,n,a,cn);
      
      System.out.println("Student id:"+s.getStudentId());
      System.out.println("Student name:"+s.getStudentName());
      System.out.println("Address:"+s.getStudentAddress());
      System.out.println("College name:"+s.getCollegeName());
      }
      
       
    }
}
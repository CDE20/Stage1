import java.util.*;
public class StudentMain
{
    public static void main (String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name=sc.next();
        System.out.println("Enter Student's address:");
        String addr=sc.next();
        String clg;
        //Student s;
        int flag=0;
        do
        {
            flag=0;
        System.out.println("Whether the student is from NIT(Yes/No):");
        clg=sc.next();
        
        if(clg.equals("yes") || clg.equals("YES"))
        {
            Student s=new Student(id,name,addr);
            System.out.println("Student id:"+s.getStudentId());
            System.out.println("Student name:"+s.getStudentName());
            System.out.println("Address:"+s.getStudentAddress());
            System.out.println("College name:"+s.getCollegeName());
        }
        else if(clg.equals("no") || clg.equals("NO"))
        {
            System.out.println("Enter the college name:");
            String clgname=sc.next();
            Student s=new Student(id,name,addr,clgname);
            System.out.println("Student id:"+s.getStudentId());
            System.out.println("Student name:"+s.getStudentName());
            System.out.println("Address:"+s.getStudentAddress());
            System.out.println("College name:"+s.getCollegeName());
        }
        else
        {
            System.out.println("Wrong Input");
            flag=1;
        }
        }while(flag==1);
        
    }
}
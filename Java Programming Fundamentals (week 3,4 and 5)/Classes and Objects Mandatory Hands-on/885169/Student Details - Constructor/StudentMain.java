import java.util.*;
public class StudentMain{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        //Student st=new Student();
        int id,temp=0;
        String name,address,clg_name,reply;
        System.out.println("Enter Student's Id:");
        id=Integer.parseInt(s.nextLine());
        System.out.println("Enter Student's Name");
        name=s.nextLine();
        System.out.println("Enter Student's address:");
        address=s.nextLine();
        do{
            
        
            System.out.println("Whether the student is from NIT(Yes/No):");
            reply=s.nextLine();
            if(reply.equals("yes") || reply.equals("YES"))
            {
                Student st1=new Student(id,name,address);
                System.out.println("Student id:"+st1.getStudentId());
                System.out.println("Student name:"+st1.getStudentName());
                System.out.println("Address:"+st1.getStudentAddress());
                System.out.println("College name:"+st1.getCollegeName());
                break;
            }
            else if(reply.equals("no") || reply.equals("No"))
            {
                System.out.println("Enter the college name:");
                clg_name=s.nextLine();
                Student st2=new Student(id,name,address,clg_name);
                System.out.println("Student id:"+st2.getStudentId());
                System.out.println("Student name:"+st2.getStudentName());
                System.out.println("Address:"+st2.getStudentAddress());
                System.out.println("College name:"+st2.getCollegeName());
                break;
            }
            else
            {
                System.out.println("Wrong Input");
                temp=1;
            }
        }while(temp==1);
    }
}
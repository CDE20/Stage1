import java.util.*;
public class StudentMain{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Student's Id:");
        int sid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String name=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Student's address:");
        String address=sc.nextLine();
        boolean flag=true;
        String confirm="";
        while(flag){
            System.out.println("Whether the student is from NIT(Yes/No):");
            confirm=sc.nextLine();
            if(confirm.equalsIgnoreCase("YES")||confirm.equalsIgnoreCase("NO")){
                flag=false;
            }
            else{
                System.out.println("Wrong Input");
            }
        }
        if(confirm.equalsIgnoreCase("YES")){
            Student s = new Student(sid,name,address);
            System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student name:"+s.getStudentName());
        System.out.println("Address:"+s.getStudentAddress());
        System.out.println("College name:"+s.getCollegeName());
        }
        else{
            System.out.println("Enter the college name:");
            String cname=sc.nextLine();
            Student s = new Student(sid,name,address,cname);
        
        
        System.out.println("Student id:"+s.getStudentId());
        System.out.println("Student name:"+s.getStudentName());
        System.out.println("Address:"+s.getStudentAddress());
        System.out.println("College name:"+s.getCollegeName());
        }
        
    }
}
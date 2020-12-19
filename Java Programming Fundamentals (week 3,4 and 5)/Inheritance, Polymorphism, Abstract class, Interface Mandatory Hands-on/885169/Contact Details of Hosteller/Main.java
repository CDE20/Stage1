import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails()
    {
        Scanner s=new Scanner(System.in);
        Student sd=new Student();
        Hosteller h=new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        sd.setStudentId(Integer.parseInt(s.nextLine()));
        System.out.println("Student Name");
        sd.setName(s.nextLine());
        System.out.println("Department Id");
        sd.setDepartmentId(Integer.parseInt(s.nextLine()));
        System.out.println("Gender");
        sd.setGender(s.nextLine());
        System.out.println("Phone Number");
        sd.setPhone(s.nextLine());
        System.out.println("Hostel Name");
        h.setHostelName(s.nextLine());
        System.out.println("Room Number");
        h.setRoomNumber(Integer.parseInt(s.nextLine()));
        h.setStudent(sd);
        return h;
        
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        Student sd=new Student();
        Hosteller h=new Hosteller();
        Main m=new Main();
        h=m.getHostellerDetails();
        sd=h.getStudent();
        System.out.println("Modify Room Number(Y/N)");
        String reply=s.next();
        if(reply.equals("Y"))
        {
            System.out.println("New Room Number");
           // int no=Integer.parseInt(s.nextLine());
            h.setRoomNumber(Integer.parseInt(s.next()));
        }
        System.out.println("Modify Phone Number(Y/N)");
        String reply1=s.next();
        if(reply1.equals("Y"))
        {
            System.out.println("New Phone Number");
            sd.setPhone(s.next());
        }
        System.out.println("The Student Details");
        System.out.print(sd.getStudentId()+" "+sd.getName()+" "+sd.getDepartmentId()+" "+sd.getGender()+" "+sd.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
    }
}














import java.util.*;
public class Main
{
    static Scanner sc=new Scanner(System.in);
    public static Hosteller getHostellerDetails()
    {
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id=sc.nextInt();
        System.out.println("Student Name");
        String name=sc.next();
        System.out.println("Department Id");
        int did=sc.nextInt();
        System.out.println("Gender");
        String gender=sc.next();
        System.out.println("Phone Number");
        String phno=sc.next();
        System.out.println("Hostel Name");
        String hostelnm=sc.next();
        System.out.println("Room Number");
        int roomno=sc.nextInt();
        
        Hosteller h=new Hosteller();
        h.setStudentId(id);
        h.setName(name);
        h.setDepartmentId(did);
        h.setGender(gender);
        h.setPhone(phno);
        h.setHostelName(hostelnm);
        h.setRoomNumber(roomno);
        return h;
    }
    public static void main (String[] args) {
        Hosteller h=getHostellerDetails();
        
        System.out.println("Modify Room Number(Y/N)");
        String rchoice=sc.next();
        
        if(rchoice.equals("Y"))
        {
            System.out.println("New Room Number");
            int no=sc.nextInt();
            h.setRoomNumber(no);
        }
        System.out.println("Modify Phone Number(Y/N)");
        String mchoice=sc.next();
        
        if(mchoice.equals("Y"))
        {
            System.out.println("New Phone Number");
            String no=sc.next();
            h.setPhone(no);
        }
        
        System.out.println("The Student Details");
        System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getDepartmentId()+" "+h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
        
    }
}
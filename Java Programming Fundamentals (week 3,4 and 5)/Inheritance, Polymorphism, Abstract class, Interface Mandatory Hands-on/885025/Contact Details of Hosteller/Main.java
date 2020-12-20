import java.util.*;
import java.util.*;
public class Main{
    public static Hosteller getHostellerDetails(){
        return new Hosteller();
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Hosteller h=Main.getHostellerDetails();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        h.setStudentId(sc.nextInt());
        System.out.println("Student Name");
        h.setName(sc.nextLine());
        System.out.println("Department Id");
        h.setDepartmentId(sc.nextInt());
        System.out.println("Gender");
        h.setGender(sc.nextLine());
        System.out.println("Phone Number");
        h.setPhone(sc.nextLine());
        System.out.println("Hostel Name");
        h.setHostelName(sc.nextLine());
        System.out.println("Room Number");
        h.setRoomNumber(sc.nextInt());
        System.out.println("Modify Room Number(Y/N)");
        String yn=sc.nextLine();
        if(yn=="Y"){
            System.out.println("New Room Number");
            h.setRoomNumber(sc.nextInt());
            }
        System.out.println("Modify Phone Number(Y/N)");
        String yn1=sc.nextLine();
        if(yn1=="Y"){
            System.out.println("New Phone Number");
            h.setPhone(sc.nextLine());
            }
        
        
        System.out.println("The Student Details");
        System.out.print(h.getStudentId()+" ");
        System.out.print(h.getName()+" ");
        System.out.print(h.getDepartmentId()+" ");
        System.out.print(h.getGender()+" ");
        System.out.print(h.getPhone()+" ");
        System.out.print(h.getHostelName()+" ");
        System.out.print(h.getRoomNumber());
        
        
        
        
    }
}
import java.util.*;
public class Main{
        
        public static void main(String[] args){
            
            System.out.println("Enter the Details:");
            Hosteller newh = getHostellerDetails();
            System.out.println("The Student Details");
            System.out.println(newh.getStudentId()+" "+newh.getName()+" "+newh.getDepartmentId()+" "+newh.getGender()+" "+newh.getPhone()+" "+newh.getHostelName()+" "+newh.getRoomNumber());
            
        }
        public static Hosteller getHostellerDetails(){
            Scanner sc =new Scanner(System.in);
            Hosteller hc = new Hosteller();
            System.out.println("Student Id");
            hc.setStudentId(sc.nextInt());
            sc.nextLine();
            System.out.println("Student Name");
            hc.setName(sc.nextLine());
            System.out.println("Department Id");
            hc.setDepartmentId(sc.nextInt());
            sc.nextLine();
            System.out.println("Gender");
            hc.setGender(sc.nextLine());
            System.out.println("Phone Number");
            hc.setPhone(sc.nextLine());
            //sc.nextLine();
            System.out.println("Hostel Name");
            hc.setHostelName(sc.nextLine());
            System.out.println("Room Number");
            hc.setRoomNumber(sc.nextInt());
            sc.nextLine();
            System.out.println("Modify Room Number(Y/N)");
            String modify_room=sc.nextLine();
            if(modify_room=="Y"){
                System.out.println("New Room Number");
                hc.setRoomNumber(sc.nextInt());
            }
            else{
                System.out.println("Modify Phone Number(Y/N)");
                 String modify_phone=sc.nextLine();
            if(modify_phone=="Y"){
                System.out.println("New Phone Number");
                hc.setPhone(sc.nextLine());
            }
            }
            
            return hc;
        }

}
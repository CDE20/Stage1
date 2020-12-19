import java.util.*;

public class Main{
	
	public static Hosteller getHostellerDetails(){
		Scanner sc=new Scanner(System.in);
		Hosteller h=new Hosteller();
		
		System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int studentId=sc.nextInt();
        h.setStudentId(studentId);
        sc.nextLine();
        System.out.println("Student Name");
        String name=sc.nextLine();
        h.setName(name);
        System.out.println("Department Id");
        int departmentId=sc.nextInt();
        h.setDepartmentId(departmentId);
        sc.nextLine();
        System.out.println("Gender");
        String gender=sc.nextLine();
        h.setGender(gender);
        System.out.println("Phone Number");
        String phone=sc.nextLine();
        h.setPhone(phone);
        System.out.println("Hostel Name");
        String hostelName=sc.nextLine();
        h.setHostelName(hostelName);
        System.out.println("Room Number");
        int roomNumber=sc.nextInt();
        h.setRoomNumber(roomNumber);
        sc.nextLine();
        System.out.println("Modify Room Number(Y/N)");
        String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("Y")) {
        	System.out.println("New Room number");
        	roomNumber = sc.nextInt();
        	h.setRoomNumber(roomNumber);
        }
		sc.nextLine();

        System.out.println("Modify Phone Number(Y/N)");
        String ans1=sc.nextLine();
        if(ans1.equalsIgnoreCase("Y")){
            System.out.println("New Phone Number");
            phone=sc.nextLine();
            h.setPhone(phone);
        }

		return h;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hosteller h = getHostellerDetails();
		System.out.println("The Student Details");
		System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getDepartmentId()+" "+h.getGender()
		+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
	}
}
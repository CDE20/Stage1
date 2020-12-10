import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hosteller h=Main.getHostellerDetails();
		System.out.println("Modify Room Number(Y/N)");
		char ans=sc.next().charAt(0);
		if(ans=='Y') {
			System.out.println("New Room Number");
			h.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(Y/N)");
		ans=sc.next().charAt(0);
		if(ans=='Y') {
			System.out.println("New Phone Number");
			h.setPhone(sc.next());
		}
		System.out.println("The Student Details");
		System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getDepartmentId()+" "+h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
	}
	
	public static Hosteller getHostellerDetails() {
		Scanner sc=new Scanner(System.in);
		Hosteller h=new Hosteller();
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		h.setStudentId(sc.nextInt());
		System.out.println("Student Name");
		h.setName(sc.next());
		System.out.println("Department Id");
		h.setDepartmentId(sc.nextInt());
		System.out.println("Gender");
		h.setGender(sc.next());
		System.out.println("Phone Number");
		h.setPhone(sc.next());
		System.out.println("Hostel Name");
		h.setHostelName(sc.next());
		System.out.println("Room Number");
		h.setRoomNumber(sc.nextInt());
		return h;
		
	}
}

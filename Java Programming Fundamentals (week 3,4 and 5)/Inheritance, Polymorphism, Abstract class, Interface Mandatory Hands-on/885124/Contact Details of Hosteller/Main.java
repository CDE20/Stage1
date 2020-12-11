import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int studentId;
	static String studentName;
	static int departmentId ;
	static String gender;
	static String phno;
	static String hostelName;
	static int roomNumber;
	public static Hosteller getHostellerDetails() {
		Hosteller h = new Hosteller();
		
		System.out.println("Enter the Details:");
		
		System.out.println("Student Id");
		studentId = Integer.parseInt(sc.nextLine());
		h.setStudentId(studentId);
		
		System.out.println("Student Name");
		studentName = sc.nextLine();
		h.setName(studentName);
		
		System.out.println("Department Id");
		departmentId = Integer.parseInt(sc.nextLine());
		h.setDepartmentId(departmentId);
		
		System.out.println("Gender");	
		gender = sc.nextLine();
		h.setGender(gender);
		
		System.out.println("Phone Number");
		phno = sc.nextLine();
		h.setPhone(phno);
		
		System.out.println("Hostel Name");
		hostelName = sc.nextLine();
		h.setHostelName(hostelName);
		
		System.out.println("Room Number");
		roomNumber = Integer.parseInt(sc.nextLine());	
		h.setRoomNumber(roomNumber);
		
		return h;
	}
	public static void main(String[] args) {
		char ans,ans1;
		Main m = new Main();
		Hosteller h1 = m.getHostellerDetails();
		System.out.println("Modify Room Number(Y/N)");
		ans = sc.next().charAt(0);
		
		if(ans=='Y') {
			System.out.println("New Room Number");
			roomNumber = sc.nextInt();
			h1.setRoomNumber(roomNumber);
		}
		
		System.out.println("Modify Phone Number(Y/N)");
		ans1 = sc.next().charAt(0);
		
		if(ans1 == 'Y') {
			System.out.println("New Phone Number");
			phno = sc.nextLine();
			h1.setPhone(phno);
		}
		
		System.out.println("The Student Details");
		System.out.println(h1.getStudentId()+" "+h1.getName()+" "+h1.getDepartmentId()+" "+h1.getGender()+" "+h1.getPhone()+" "+h1.getHostelName()+" "+h1.getRoomNumber());
	}

}

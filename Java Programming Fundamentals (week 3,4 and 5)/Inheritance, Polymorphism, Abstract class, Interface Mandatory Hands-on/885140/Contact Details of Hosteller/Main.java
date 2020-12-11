import java.util.Scanner;

public class Main{
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		Hosteller h = getHostellerDetails();
		System.out.println("Modify Room Number(Y/N)");
		String response = sc.next();
		if(response.equalsIgnoreCase("y"))
		{
			System.out.println("New Room Number");
			h.setRoomNumber(sc.nextInt());
			
		}
		System.out.println("Modify Phone Number(Y/N)");
		response = sc.next();
		if(response.equalsIgnoreCase("y")) {
			System.out.println("New Phone Number");
			h.setPhone(sc.next());
		}
		// OUTPUT
		
		System.out.println("The Student Details");
		System.out.println(h.getStudentId() + " " +h.getName() + " " + h.getDepartmentId() + " " + 
		h.getGender() + " " + h.getPhone() + " " + h.getHostelName() + " " + h.getRoomNumber());
		

	}
	public static Hosteller getHostellerDetails() {

		Hosteller h = new Hosteller();
		System.out.println("Enter the details:");
		System.out.println("Student Id");
		int id = sc.nextInt();
		h.setStudentId(id);
		System.out.println("Student Name");
		sc.nextLine();
		String name = sc.nextLine();
		h.setName(name);
		System.out.println("Department Id");
		int deptId = sc.nextInt();
		h.setDepartmentId(deptId);
		System.out.println("Gender");
		sc.nextLine();
		String gender = sc.nextLine();
		h.setGender(gender);
		System.out.println("Phone Number");
		String phone = sc.nextLine();
		h.setPhone(phone);
		System.out.println("Hostel Name");
		String hostel = sc.nextLine();
		h.setHostelName(hostel);
		System.out.println("Room Number");
		int room = sc.nextInt();
		h.setRoomNumber(room);
		return h;
	}
}
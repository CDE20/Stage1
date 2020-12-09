import java.util.*;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	
	public static Hosteller getHostellerDetails() {
		System.out.println("Enter the Details:\nStudent Id");
		int studId = sc.nextInt();
		System.out.println("Student Name");
		String name = sc.next();
		System.out.println("Department Id");
		int deptId = sc.nextInt();
		System.out.println("Gender");
		String gender = sc.next();
		System.out.println("Phone Number");
		String phone = sc.next();
		System.out.println("Hostel Name");
		String hostel = sc.next();
		System.out.println("Room Number");
		int room = sc.nextInt();
		Hosteller h = new Hosteller();
		h.setStudentId(studId);
		h.setName(name);
		h.setDepartmentId(deptId);
		h.setGender(gender);
		h.setPhone(phone);
		h.setHostelName(hostel);
		h.setRoomNumber(room);
		return h;
	}
	public static void main(String[] args) {
		
		Hosteller h = getHostellerDetails();
		System.out.println("Modify Room Number(Y/N)");
		String newOption = sc.next();
		if(newOption.equalsIgnoreCase("Y"))
		{
			System.out.println("New Room Number");
			int newRoom = sc.nextInt();
			h.setRoomNumber(newRoom);
		}
		System.out.println("Modify Phone Number(Y/N)");
		newOption = sc.next();
		if(newOption.equalsIgnoreCase("Y"))
		{
			System.out.println("New Phone Number");
			String newPhone = sc.next();
			h.setPhone(newPhone);
		}
		
		System.out.println("The Student Details");
		System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getGender()+" "+h.getPhone()+" "+h.getHostelName()+" "+h.getRoomNumber());
	}
}

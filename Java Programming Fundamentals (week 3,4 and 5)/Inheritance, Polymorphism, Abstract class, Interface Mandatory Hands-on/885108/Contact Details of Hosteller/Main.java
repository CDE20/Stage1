import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hosteller h = getHostellerDetails();
		Scanner sc =new Scanner(System.in);
		char c ;
		System.out.println("Modify Room Number(Y/N)");
		c = sc.next().charAt(0);
		if(c == 'Y'){
			System.out.println("New Room Number");
			h.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(Y/N)");
		c = sc.next().charAt(0);
		if(c == 'Y'){
			System.out.println("New Phone Number");
			h.setPhone(sc.next());
		}	
		System.out.println("The Student Details");
		System.out.println(h.getStudentId()+" "+h.getName()+" "+h.getDepartmentId()+" "+h.getGender()+" "+h.getPhone()+" "+ h.getHostelName()+" "+h.getRoomNumber());
	}
	public static Hosteller getHostellerDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details");
		Hosteller h = new Hosteller();
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

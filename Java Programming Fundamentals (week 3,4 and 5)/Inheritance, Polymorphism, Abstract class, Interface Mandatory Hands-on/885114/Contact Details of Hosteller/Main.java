import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Hosteller hosteller = getHostellerDetails();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Modify Room Number(Y/N)");
		if (sc.nextLine().charAt(0) == 'Y') {
			System.out.println("New Room Number");
			hosteller.setRoomNumber(Integer.parseInt(sc.nextLine()));
		}
		
		System.out.println("Modify Phone Number(Y/N)");
		if (sc.nextLine().charAt(0) == 'Y') {
			System.out.println("New Phone Number");
			hosteller.setPhone(sc.nextLine());
		}
		
		StringBuilder output = new StringBuilder();
		output.append(hosteller.getStudentId()).append(" ");
		output.append(hosteller.getName()).append(" ");
		output.append(hosteller.getDepartmentId()).append(" ");
		output.append(hosteller.getGender()).append(" ");
		output.append(hosteller.getPhone()).append(" ");
		output.append(hosteller.getHostelName()).append(" ");
		output.append(hosteller.getRoomNumber());
		
		System.out.println(output.toString());

	}
	
	public static Hosteller getHostellerDetails() { 
		Hosteller hosteller = new Hosteller();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details");
		System.out.println("Student Id");
		hosteller.setStudentId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Student Name");
		hosteller.setName(sc.nextLine());
		
		System.out.println("Department Id");
		hosteller.setDepartmentId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Gender");
		hosteller.setGender(sc.nextLine());
		
		System.out.println("Phone Number");
		hosteller.setPhone(sc.nextLine());
		
		System.out.println("Hostel Name");
		hosteller.setHostelName(sc.nextLine());
		
		System.out.println("Room Number");
		hosteller.setRoomNumber(Integer.parseInt(sc.nextLine()));
		
		return hosteller;
	}

}

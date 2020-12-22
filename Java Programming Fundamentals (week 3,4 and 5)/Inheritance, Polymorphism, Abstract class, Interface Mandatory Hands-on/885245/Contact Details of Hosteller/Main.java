import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		Hosteller hosteller = getHostellerDetails();
		System.out.println("The Student Details:");
		System.out.println(hosteller.getStudentId() + " " + hosteller.getName() + " " + hosteller.getDepartmentId()
				+ " " + hosteller.getGender() + " " + hosteller.getPhone() + " " + hosteller.getHostelName() + " "
				+ hosteller.getRoomNumber());
	}
	public static Hosteller getHostellerDetails()
	{
		Scanner sc = new Scanner(System.in);
		Hosteller hosteller = new Hosteller();
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		hosteller.setStudentId(sc.nextInt());
		System.out.println("Student Name");
		hosteller.setName(sc.nextLine().trim());
		System.out.println("Department Id");
		hosteller.setDepartmentId(sc.nextInt());
		System.out.println("Gender");
		hosteller.setGender(sc.nextLine().trim());
		System.out.println("Phone Number");
		hosteller.setPhone(sc.nextLine().trim());
		System.out.println("Hostel Name");
		hosteller.setHostelName(sc.nextLine().trim());
		System.out.println("Room Number");
		hosteller.setRoomNumber(sc.nextInt());
		System.out.println("Modify Room Number(Y/N)");
		if (sc.next().equals("Y")) 
		{
			System.out.println("New Room Number");
			hosteller.setRoomNumber(sc.nextInt());
		}
		System.out.println("Modify Phone Number(Y/N)");
		if (sc.next().equals("Y")) 
		{
			System.out.println("New Phone Number");
			hosteller.setPhone(sc.nextLine().trim());
		}
		return hosteller;
	}
}

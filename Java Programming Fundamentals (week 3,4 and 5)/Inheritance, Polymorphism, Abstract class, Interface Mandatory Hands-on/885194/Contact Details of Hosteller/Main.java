import java.util.Scanner;
public class Main {
    public static Hosteller getHostellerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int studentId = sc.nextInt();
        System.out.println("Student Name");
        String name = sc.next();
        System.out.println("Department Id");
        int deptId = sc.nextInt();
        System.out.println("Gender");
        String gender = sc.next();
        System.out.println("Phone Number");
        String phoneNumber = sc.next();
        System.out.println("Hostel Name");
        String hostelName = sc.next();
        System.out.println("Room Number");
        int roomNo = sc.nextInt();
        System.out.println("Modify Room Number(Y/N)");
        String choice = sc.next();
        if (choice.equals("Y")) {
            System.out.println("New Room Number");
            roomNo = sc.nextInt();
        }
        System.out.println("Modify Phone Number(Y/N)");
        choice = sc.next();
        if (choice.equals("Y")) {
            System.out.println("New Phone Number");
            phoneNumber = sc.next();
        }
        Hosteller hosteller = new Hosteller();
        hosteller.setStudentId(studentId);
        hosteller.setName(name);
        hosteller.setDepartmentId(deptId);
        hosteller.setGender(gender);
        hosteller.setPhone(phoneNumber);
        hosteller.setHostelName(hostelName);
        hosteller.setRoomNumber(roomNo);
        return hosteller;
    }
    
    public static void displayHostellerDetails(Hosteller hosteller) {
        System.out.println("The Student Details:");
        System.out.print(hosteller.getStudentId() + " ");
        System.out.print(hosteller.getName() + " ");
        System.out.print(hosteller.getDepartmentId() + " ");
        System.out.print(hosteller.getGender() + " ");
        System.out.print(hosteller.getPhone() + " ");
        System.out.print(hosteller.getHostelName() + " ");
        System.out.print(hosteller.getRoomNumber());
    }
    public static void main(String[] args) {
        Hosteller hosteller = getHostellerDetails();
        displayHostellerDetails(hosteller);
    }
}
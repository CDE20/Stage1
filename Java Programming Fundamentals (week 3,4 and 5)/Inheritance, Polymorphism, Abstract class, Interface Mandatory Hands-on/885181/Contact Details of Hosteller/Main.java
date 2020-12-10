import java.util.*;
public class Main{
     
     private static Scanner sc=new Scanner(System.in);
    /* static Hosteller h=new Hosteller(); */
     public static Hosteller getHostellerDetails(){
          System.out.println("Enter the Details");
          System.out.println("Student Id");
          int studentId=sc.nextInt();
          System.out.println("Student Name");
          String name=sc.nextLine();
          System.out.println("Department Id");
          int departmentId=sc.nextInt();
          System.out.println("Gender");
          String gender=sc.nextLine();
          System.out.println("Phone Number");
          String phone=sc.nextLine();
          System.out.println("Hostel Name");
          String hostelName=sc.nextLine();
          System.out.println("Room Number");
          int roomNumber=sc.nextInt();
          
           Hosteller h=new Hosteller();
           
          h.setStudentId(studentId);
          h.setName(name);
          h.setDepartmentId(departmentId);
          h.setGender(gender);
          h.setPhone(phone);
          h.setHostelName(hostelName);
          h.setRoomNumber(roomNumber);
          
          System.out.println("Modify Room Number(Y/N)");
          String ans=sc.nextLine();
          if(ans=="y"||ans=="Y")
           {
            System.out.println("New Room Number");
             roomNumber=sc.nextInt();
            h.setRoomNumber(roomNumber);
          
          }
         System.out.println("Modify Phone Number(Y/N");
         String anss=sc.nextLine();
         if(anss=="y"||anss=="Y")
         {
            System.out.println("New Phone Number");
            phone=sc.nextLine();
            h.setPhone(phone);
          }
          
        
          
          return h;
        }
      
  public static void main(String[] args)
  {
      
     Student stud=new Student();
      
      Hosteller hh=new Hosteller();
      hh=getHostellerDetails();
     
      System.out.println("The Student Details");
      System.out.println(hh.getStudentId()+" "+hh.getName()+" "+hh.getDepartmentId()+" "+hh.getGender()+" "+hh.getPhone()+" "+hh.getHostelName()+" "+hh.getRoomNumber());
  }
    
}
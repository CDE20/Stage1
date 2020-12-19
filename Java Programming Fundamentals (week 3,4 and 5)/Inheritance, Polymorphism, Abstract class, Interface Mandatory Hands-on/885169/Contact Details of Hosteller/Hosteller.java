public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public String getHostelName(){
        return hostelName;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public int getStudentId(){
        return super.getStudentId();
    }
    public String getName(){
        return super.getName();
    }
    public int getDepartmentId(){
        return super.getDepartmentId();
    }
    public String getGender(){
        return super.getGender();
    }
    public String getPhone(){
        return super.getPhone();
    }
    
    public void setHostelName(String hostelName ){
        this.hostelName =hostelName ;
    }
    public void setRoomNumber(int roomNumber ){
        this.roomNumber =roomNumber ;
    }
    public void setStudentId(int studentId ){
        super.setStudentId(studentId);
    }
    public void setName(String name ){
        super.setName(name);
    }
    public void setDepartmentId(int departmentId ){
        super.setDepartmentId(departmentId) ;
    }
    public void setGender(String gender ){
        super.setGender(gender);
    }
    public void setPhone(String phone ){
        super.setPhone(phone);
    }
    Student s;
    public void setStudent(Student student)
    {
        s=student;
    }
    public Student getStudent()
    {
        return s;
    }
}
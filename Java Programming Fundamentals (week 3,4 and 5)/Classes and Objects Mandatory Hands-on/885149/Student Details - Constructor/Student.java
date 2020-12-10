public class Student{
    
    private int studentId;
    private String studentName,studentAddress,collegeName;
    
    public Student(int sid,String sname,String saddress){
        this.studentId=sid;
        this.studentName=sname;
        this.studentAddress=saddress;
        this.collegeName="NIT";
    }
    
    public Student(int id,String sname,String saddress,String cname){
        this.studentId=id;
        this.studentName=sname;
        this.studentAddress=saddress;
        this.collegeName=cname;
    }
    
    public void setStudentId(int sid){
        this.studentId=sid;
    }
    public int getStudentId(){
        return this.studentId;
    }
    
    public void setStudentName(String sname){
        this.studentName=sname;
    }
    public String getStudentName(){
        return this.studentName;
    }
    
    public void setStudentAddress(String saddress){
        this.studentAddress=saddress;
    }
    public String getStudentAddress(){
        return this.studentAddress;
    }
    public void setCollegeName(String cname){
        this.collegeName=cname;
    }
    public String getCollegeName(){
        return this.collegeName;
    }
}
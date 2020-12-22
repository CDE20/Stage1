public class Student
{
    private String studentName,studentAddress,collegeName;
    private int studentId;
    public Student(int studentId,String studentName,String studentAddress)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName="NIT";
    }
    public Student(int studentId,String studentName,String studentAddress,String collegeName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.collegeName=collegeName;
    }
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentAddress(String studentAddress)
    {
        this.studentAddress=studentAddress;
    }
    public String getStudentAddress()
    {
        return studentAddress;
    }
    public void setCollegeName(String collegeName)
    {
        this.collegeName=collegeName;
    }
    public String getCollegeName()
    {
        return collegeName;
    }
}
public class Student{
	
	private int studentId;
	private String studentName,studentAddress,collegeName;
	
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	
	public Student(int studentId, String studentName, String studentAddress, String studentCollege) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = studentCollege;
	}
	

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setStudentCollege(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
}
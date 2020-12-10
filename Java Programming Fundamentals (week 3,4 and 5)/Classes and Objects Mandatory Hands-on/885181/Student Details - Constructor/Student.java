public class Student{
    private int studentId;
    private String studentName,studentAddress,collegeName;
    
   public Student(int studentId,String studentName,String studentAddress,String collegeName){
        this.studentId=studentId;
         this.studentName=studentName;
         this.studentAddress=studentAddress; 
         this.collegeName=collegeName;
    }
    
    public Student(int studentId,String studentName,String studentAddress){
        this.studentId=studentId;
         this.studentName=studentName;
         this.studentAddress=studentAddress; 
         this.collegeName="NIT";
    }
    
    
    
  /*  public void check(String collegeName){
        
        if(collegeName=="yes"||collegeName=="YES"||collegeName=="Yes")
        {
        System.out.println("college name:"+collegeName);
        }else if(collegeName=="no"|| collegeName=="NO" || collegeName=="No")
        {
            System.out.println("college name:"+collegeName);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
        */
   public int getStudentId(){
       return studentId;
   }
   public String getStudentName(){
       return studentName;
   }
   public String getStudentAddress(){
       return studentAddress;
   }
    public String getCollegeName(){
       return collegeName;
   }
}
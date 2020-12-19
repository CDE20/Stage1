import java.util.*;

public class Placement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CSE=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ECE=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH=sc.nextInt();
        
        if(ECE<0 || CSE<0 || MECH<0){
            System.out.println("Input is Invalid");
        }
        else{
            if(CSE==ECE && ECE==MECH && CSE==MECH){
                System.out.println("None of the department has got the highest placement");
            }
            
            else {
                   System.out.println("Highest placement\n");
                   if(CSE>=ECE && CSE>=MECH)
                   System.out.println("CSE");
                   if(ECE>=CSE && ECE>=MECH)
                   System.out.println("ECE");
                   if(MECH>=ECE && MECH>=CSE)
                   System.out.println("MECH");
            }  
                   
        }
            
        
        
    }
}
import java.util.Scanner;
class Placement{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int CSE,ECE,MECH;
        System.out.println("Enter the no of students placed in CSE:");
        CSE=sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ECE=sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        MECH=sc.nextInt();
        if(CSE>=0 && ECE>=0 && MECH>=0){
            if(CSE==MECH && CSE==ECE)
                System.out.println("None of the department has got the highest placement");
            else{ 
                System.out.println("Highest placement");
                if(CSE>=ECE && CSE>=MECH)
                System.out.println("CSE");
                if(ECE>=CSE && ECE>=MECH)
                System.out.println("ECE");
                if(MECH>=CSE && MECH>ECE)
                System.out.println("MECH");
                }
        }
            else
        System.out.println("Input is Invalid");
   }
}


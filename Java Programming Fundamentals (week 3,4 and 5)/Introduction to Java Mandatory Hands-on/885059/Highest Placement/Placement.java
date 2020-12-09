import java.util.*;

public class Placement 
{
    public static void main (String[] args) {
        int cse, ece, mech;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        mech = sc.nextInt();
        
        if(cse<0 || ece<0 || mech<0)
        {
            System.out.println("Input is Invalid");
        }
        else if(cse==ece && cse==mech)
        {
            System.out.println("None of the department has got the highest placement");
        }
        else
        {
            System.out.println("Highest placement");
            if(cse>=ece && cse>=mech)
            {
                System.out.println("CSE");
                if(cse == ece)
                {
                    System.out.println("ECE");
                }
                else if(cse == mech)
                {
                    System.out.println("MECH");
                }
            }
            else if(ece>=cse && ece>=mech)
            {
                System.out.println("ECE");
                if(ece == mech)
                {
                    System.out.println("MECH");
                }
            }
            else
            {
                System.out.println("MECH");
            }
        }
    }    
}
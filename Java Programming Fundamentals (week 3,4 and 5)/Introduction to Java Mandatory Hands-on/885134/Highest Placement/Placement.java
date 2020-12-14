import java.util.*;
public class Placement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int cse,ece,mech;
        
        System.out.println("Enter the no of students placed in CSE:");
        cse=sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        ece=sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        mech=sc.nextInt();
        if(cse<0 ||ece<0 || mech<0)
        {
            System.out.println("\nInput is Invalid");
        }
        else if(cse==ece && cse==mech)
        {
            System.out.println("\nNone of the department has got the highest placement");
        }   
        else if(cse>=ece && cse>=mech)
        {
            if(cse==ece)
                System.out.println("\nHighest placement\nCSE\nECE");
            else if(cse==mech)
                System.out.println("\nHighest placement\nCSE\nMECH");
            else
                System.out.println("\nHighest placement\nCSE");
        }
        else if(ece>=cse && ece>=mech)
        {
            if(ece==mech)
                System.out.println("\nHighest placement\nECE\nMECH");
            else
                System.out.println("\nHighest placement\nECE");
        }
        else
        {
            System.out.println("\nHighest placement\nMECH");
        }
        
    }
}
import java.util.*;
public class Placement
{
    public static void main(String args[])
    {
        
    
        Scanner s=new Scanner(System.in);
        int CSE,ECE,MECH;
        System.out.println("Enter the no of students placed in CSE:");
        CSE=s.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ECE=s.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        MECH=s.nextInt();
        if(ECE>=0 && CSE>=0 && MECH>=0)
        {
            if(CSE==ECE && ECE>MECH && CSE>MECH)
            {
                System.out.println("Highest placement");
                System.out.println("CSE\nECE");
            }else
            {
                if(CSE==MECH && MECH>ECE && CSE>ECE)
                {
                    System.out.println("Highest placement");
                    System.out.println("CSE\nMECH");
                }else
                {
                    
                    if(ECE==MECH && MECH>CSE && ECE>CSE)
                    {
                        System.out.println("Highest placement");
                        System.out.println("ECE\nMECH");
                    }else
                    {
                    
                        if(CSE>ECE && CSE>MECH)
                        {
                            System.out.println("Highest placement");
                            System.out.println("CSE");
                        }
                        else
                        {
                            if(ECE>CSE && ECE>MECH)
                            {
                                System.out.println("Highest placement");
                                System.out.println("ECE");
                            }
                            else
                            {
                                if(CSE==ECE && ECE==MECH)
                                {
                                    System.out.println("None of the department has got the highest placement");
                                }
                                else 
                                {
                                    System.out.println("Highest placement");
                                    System.out.println("MECH");
                                }
                            }
                        }
                    }
                }
            }
        }
        else System.out.println("Input is invalid");
    }
         
}
    
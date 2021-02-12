import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
public class UserInterface
{
    public static void main(String args[])
    {
        // System.out.println(new EBBill(-1).calculateBillAmount());
        // System.out.println(new EBBill(48).calculateBillAmount());
        // System.out.println(new EBBill(88).calculateBillAmount());
        // System.out.println(new EBBill(157).calculateBillAmount());
        // System.out.println(new EBBill(400).calculateBillAmount());
        // System.out.println(new EBBill(1560).calculateBillAmount());
        
        Result result=JUnitCore.runClasses(EBBillTest.class);
        
        if(result.getFailureCount()==0)
        {
               System.out.println("There are No Failures...\n Test Passed...");
        }
        else
        {
            for(Failure failure: result.getFailures())
            
            {
                 System.out.println("The Test execution failed...\n"+failure.getMessage());
            }
        }
        System.out.println("Result => "+result.wasSuccessful());
    }
}
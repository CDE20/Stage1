import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
    public void testCalculateBill()
    {
        EBBill e1= new EBBill(0);
        assertEquals(0.0, e1.calculateBillAmount(),0.001);
        
        EBBill e2= new EBBill(50);
         assertEquals(130.0, e2.calculateBillAmount(),0.001);
        EBBill e3= new EBBill(100);
         assertEquals(292.5, e3.calculateBillAmount(),0.001);
        EBBill e4= new EBBill(200);
         assertEquals(818.5, e4.calculateBillAmount(),0.001);
        EBBill e5= new EBBill(1000);
         assertEquals(7018.5, e5.calculateBillAmount(),0.001);
        EBBill e6= new EBBill(5000);
         assertEquals(47018.5, e6.calculateBillAmount(),0.001);
        
    }
    
}
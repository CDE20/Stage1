import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class EBBillTest
{
    EBBill eBill;
    //Write JUNIT Test Code
    
    @Test
    public void testCalculateBillAmount_0Units() {
        eBill = new EBBill(0);
        assertTrue(0.0 == eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_20Units() {
        eBill = new EBBill(20);
        assertTrue(52 == eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_100Units() {
        eBill = new EBBill(100);
        assertTrue(292.50 == eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_200Units() {
        eBill = new EBBill(200);
        assertTrue(818.50 == eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_1000Units() {
        eBill = new EBBill(1000);
        assertTrue(7018.50 == eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount_3000Units() {
        eBill = new EBBill(3000);
        assertTrue(27018.50 == eBill.calculateBillAmount());
    }
    
    
}
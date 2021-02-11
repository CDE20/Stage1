import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import org.junit.Test;


public class EBBillTest {
    
    EBBill ebBill;

    @Test
    public void testCalculateBillAmount_0Units() {
        ebBill = new EBBill(0);
        assertEquals(0.0, ebBill.calculateBillAmount());
        
    }
    
    @Test
    public void testCalculateBillAmount_40Units() {
        ebBill = new EBBill(40);
        assertEquals(104.0, ebBill.calculateBillAmount(), 0.0000000000001);
        
    }
    
    @Test
    public void testCalculateBillAmount_160Units() {
        ebBill = new EBBill(160);
        assertEquals(608.0999999999999, ebBill.calculateBillAmount(), 0.0000000000001);
        
    }
    
    @Test
    public void testCalculateBillAmount_400Units() {
        ebBill = new EBBill(400);
        assertEquals(2368.5, ebBill.calculateBillAmount(), 0.0000000000001);
    }
    
    @Test
    public void testCalculateBillAmount_4000Units() {
        ebBill = new EBBill(4000);
        assertEquals(37018.5, ebBill.calculateBillAmount(), 0.0000000000001);
    }
    
    @Test
    public void testCalculateBillAmount_6000Units() {
        ebBill = new EBBill(6000);
        assertEquals(0.0, ebBill.calculateBillAmount(), 0.0000000000001);
    }
}

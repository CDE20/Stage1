import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
    public void test() {
        assertEquals(0.0, new EBBill(-1).calculateBillAmount(), 0.00000000000001);
        assertEquals(124.80000000000001, new EBBill(48).calculateBillAmount(), 0.00000000000001);
        assertEquals(253.5, new EBBill(88).calculateBillAmount(), 0.00000000000001);
        assertEquals(592.3199999999999 , new EBBill(157).calculateBillAmount(), 0.00000000000001);
        assertEquals(2368.5, new EBBill(400).calculateBillAmount(), 0.00000000000001);
        assertEquals(12618.5, new EBBill(1560).calculateBillAmount(), 0.00000000000001);
    }
    
}
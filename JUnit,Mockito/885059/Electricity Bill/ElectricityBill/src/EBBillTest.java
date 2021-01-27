import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
    public void calculateBillAmountTestLessThan50() {
        EBBill bill = new EBBill(20);
        assertEquals(52, bill.calculateBillAmount(), 0.1);
    }
    
    @Test
    public void calculateBillAmountTestLessThan100() {
        EBBill bill = new EBBill(80);
        assertEquals(227.5, bill.calculateBillAmount(), 0.1);
    }
    
    @Test
    public void calculateBillAmountTestLessThan200() {
        EBBill bill = new EBBill(150);
        assertEquals(555.5, bill.calculateBillAmount(), 0.1);
    }
    
    @Test
    public void calculateBillAmountTestLessThan1000() {
        EBBill bill = new EBBill(555);
        assertEquals(3569.75, bill.calculateBillAmount(), 0.1);
    }
    
    @Test
    public void calculateBillAmountTestLessThan5000() {
        EBBill bill = new EBBill(4555);
        assertEquals(42568.5, bill.calculateBillAmount(), 0.1);
    }
    
    @Test
    public void calculateBillAmountTestMoreThan5000() {
        EBBill bill = new EBBill(6000);
        assertEquals(0, bill.calculateBillAmount(), 0.1);
    }
}
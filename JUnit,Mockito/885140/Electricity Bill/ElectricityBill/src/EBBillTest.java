import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
    public void testCalculateBillAmount1(){
        EBBill bill = new EBBill(50);
        assertEquals(130,bill.calculateBillAmount(),0.2);
    }
    @Test
    public void testCalculateBillAmount2(){
        EBBill bill = new EBBill(100);
        assertEquals(292.5,bill.calculateBillAmount(),0.2);
    }
    
    @Test
    public void testCalculateBillAmount3(){
        EBBill bill = new EBBill(200);
        assertEquals(818.5,bill.calculateBillAmount(),0.2);
    }
    
    @Test
    public void testCalculateBillAmount4(){
        EBBill bill = new EBBill(1000);
        assertEquals(7018.5,bill.calculateBillAmount(),0.2);
    }
    
    @Test
    public void testCalculateBillAmount5(){
        EBBill bill = new EBBill(5001);
        assertEquals(0,bill.calculateBillAmount(),0.2);
    }
    
      @Test
    public void testCalculateBillAmount6(){
        EBBill bill = new EBBill(1001);
        assertEquals(7028.5,bill.calculateBillAmount(),0.2);
    }
    
}
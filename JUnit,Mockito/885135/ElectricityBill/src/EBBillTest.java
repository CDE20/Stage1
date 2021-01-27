import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
    public void testCalculateBillAmount6(){
        EBBill eb = new EBBill(0);
         assertTrue(0==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount1(){
        EBBill eBill = new EBBill(45);
        assertTrue(117==eBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount2(){
        EBBill eBBill=new EBBill(100);
        assertTrue(292.5==eBBill.calculateBillAmount());
    }    
    
    @Test
    public void testCalculateBillAmount3(){
        EBBill eBBill=new EBBill(200);
        assertTrue(818.5==eBBill.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount4(){
        EBBill eb = new EBBill(1000);
         assertTrue(7018.5==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount5(){
        EBBill eb = new EBBill(5000);
         assertTrue(47018.5==eb.calculateBillAmount());
    }
    
    
}
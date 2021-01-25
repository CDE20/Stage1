import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;


public class EBBillTest
{
    EBBill eb;
    
    @Test
    public void testCalculateBillAmount_UnitsEqualTo0(){
        eb = new EBBill(0);
        Assert.assertEquals(0,eb.calculateBillAmount(),0.9);
    }
    
    @Test
    public void testCalculateBillAmount_UnitsLessThan50(){
        eb = new EBBill(30);
        Assert.assertEquals(30*2.60,eb.calculateBillAmount(),0.9);
    }
    
     @Test
    public void testCalculateBillAmount_UnitsLessThanOrEqualTo100(){
        eb = new EBBill(95);
        Assert.assertEquals((130+45*3.25),eb.calculateBillAmount(),0.9);
    }
    
     @Test
    public void testCalculateBillAmount_UnitsLessThanOrEqualTo200(){
        eb = new EBBill(175);
        Assert.assertEquals(130 + 162.50 + ((175 - 100 ) * 5.26),eb.calculateBillAmount(),0.9);
    }
    
     @Test
    public void testCalculateBillAmount_UnitsLessThanOrEqualTo1000(){
        eb = new EBBill(700);
        Assert.assertEquals(130 + 162.50 + 526 + ((700 - 200 ) * 7.75),eb.calculateBillAmount(),0.9);
    }
    
    @Test
    public void testCalculateBillAmount_UnitsLessThanOrEqualTo5000(){
        eb = new EBBill(2500);
        Assert.assertEquals((130 + 162.50 + 526 + 6200 + ((2500 - 1000) * 10)),eb.calculateBillAmount(),0.9);
    }
}
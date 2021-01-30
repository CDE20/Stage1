import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import static org.junit.Assert.*;

public class EBBillTest
{
    EBBill obj;
    @Test
    public void tset1(){
        obj=new EBBill(30);
        assertEquals(78,obj.calculateBillAmount(),1.0);
    }
    
    @Test
    public void tset2(){
        obj=new EBBill(100);
        assertEquals(292.5,obj.calculateBillAmount(),1.0);
    }
    @Test
    public void tset3(){
        obj=new EBBill(200);
        assertEquals(818.5,obj.calculateBillAmount(),1.0);
    }
    @Test
    public void tset4(){
        obj=new EBBill(1000);
        assertEquals(4693.5,obj.calculateBillAmount(),1.0);
    }
    @Test
    public void tset5(){
        obj=new EBBill(5000);
        assertEquals(47018.5,obj.calculateBillAmount(),1.0);
    }

    @Test
    public void tset6(){
        obj=new EBBill(6000);
        assertEquals(0.0,obj.calculateBillAmount(),1.0);
    }

    
}
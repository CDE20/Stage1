import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    @Test
	public void test() {
		EBBill eb1=new EBBill(0);
		double actual1=eb1.calculateBillAmount();
		assertEquals(0.0,actual1,0.001);
		
		EBBill eb2=new EBBill(50);
		double actual2=eb2.calculateBillAmount();
		assertEquals(130.0,actual2,0.001);
		
		EBBill eb3=new EBBill(100);
		double actual3=eb3.calculateBillAmount();
		assertEquals(292.5,actual3,0.001);
		
		EBBill eb4=new EBBill(200);
		double actual4=eb4.calculateBillAmount();
		assertEquals(818.5,actual4,0.001);
		
		EBBill eb5=new EBBill(1000);
		double actual5=eb5.calculateBillAmount();
		assertEquals(7018.5,actual5,0.001);
		
		EBBill eb6=new EBBill(3000);
		double actual6=eb6.calculateBillAmount();
		assertEquals(27018.5,actual6,0.001);
	}
    
}
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class EMICalculatorTest {

//Write JUNIT Test Code
	EMICalculator emi = new EMICalculator();
	
	@Test
	public void testCalculateEMIHousingLoan(){
		assertEquals(501.5264995075172,emi.calculateEMI(30000,"Housing Loan", 5),0.9);
	}
	
	@Test
	public void testCalculateEMIHousingLoanLessthanRequiredPriciple(){
		assertEquals(0.0,emi.calculateEMI(9999,"Housing Loan", 10),0.0);
	}
	
	@Test
	public void testCalculateEMIHousingLoanMoreThanRequiredDuration(){
		assertEquals(0.0,emi.calculateEMI(100000,"Housing Loan", 21),0.0);
	}
	
	@Test
	public void testCalculateEMIVehicleLoan(){
		assertEquals(13146.319649517338,emi.calculateEMI(1100000,"Vehicle Loan", 7),0.9);
	}
	
	@Test
	public void testCalculateEMIVehicleLoanLessthanRequiredPriciple(){
		assertEquals(0.0,emi.calculateEMI(5000,"Housing Loan", 10),0.0);
	}
	
	@Test
	public void testCalculateEMIVehicleLoanMoreThanRequiredDuration(){
		assertEquals(0.0,emi.calculateEMI(100000,"Housing Loan", 25),0.0);
	}
	
	@Test
	public void testCalculateEMIPersonalLoan(){
		assertEquals(13910.311334102333,emi.calculateEMI(500000,"Personal Loan", 3),0.9);
	}
	
	@Test
	public void testCalculateEMIPersonalLoanLessthanRequiredPriciple(){
		assertEquals(0.0,emi.calculateEMI(10,"Personal Loan", 100),0.0);
	}
	
	@Test
	public void testCalculateEMIPersonalLoanMoreThanRequiredDuration(){
		assertEquals(0.0,emi.calculateEMI(100000,"Personal Loan", 0),0.0);
	}
    
}

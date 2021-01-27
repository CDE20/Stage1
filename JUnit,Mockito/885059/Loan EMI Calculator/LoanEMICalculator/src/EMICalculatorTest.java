import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class EMICalculatorTest {

//Write JUNIT Test Code

    EMICalculator calc;
    
	@Before
	public void before() {
	    calc = new EMICalculator();
	}

	@Test
	public void checkHousingLoanTest() {
		assertEquals(250.7632497537586, calc.calculateEMI(15000, "Housing Loan", 5), 0.1);
	}

	@Test
	public void checkVehicleLoanTest() {
		assertEquals(250.699588337597, calc.calculateEMI(15000, "Vehicle Loan", 5), 0.1);
	}

	@Test
	public void checkPersonalLoanTest() {
		assertEquals(250.6359373331037, calc.calculateEMI(15000, "Personal Loan", 5), 0.1);
	}

	@Test
	public void checkInvalidPrincipalAmountTest() {
		assertEquals(0.0, calc.calculateEMI(5000, "Housing Loan", 5), 0.1);
	}
}

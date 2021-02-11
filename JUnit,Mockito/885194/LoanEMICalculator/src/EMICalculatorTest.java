import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class EMICalculatorTest {
    EMICalculator e = new EMICalculator();
    
    @Test 
    public void testCalcuateEMI_housingLoan() {
        assertEquals(500.6252395713697, e.calculateEMI(12000, "Housing Loan", 2), 0);
    }
    
    @Test 
    public void testCalcuateEMI_vehicleLoan() {
        assertEquals(500.57311797432794, e.calculateEMI(12000, "Vehicle Loan", 2), 0);
    }
    
    @Test 
    public void testCalcuateEMI_personalLoan() {
        assertEquals(500.5209997030931, e.calculateEMI(12000, "Personal Loan", 2), 0);
    }
    
    @Test
    public void testCalculateEMI_incorrectParameters() {
        assertEquals(0.0, e.calculateEMI(9000, "Housing Loan", 5), 0);
    }
}

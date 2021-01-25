package com.cts.rainbowjewellers.test;
import java.util.Arrays;
import java.util.Collection;
import com.cts.rainbowjewellers.service.RainbowJewellersService;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    private double input;
    private double expectedOutput;
    
    RainbowJewellersService service = new RainbowJewellersService();
    
    public RainbowJewellersParameterizedTest(double input, double expectedOutput)
    {
        this.input=input;
        this.expectedOutput=expectedOutput;
    }
    @Parameterized.Parameters
    public static Collection testCondition()
    {
        //double expectedOutputs[][]={{9.6,48401.76},{56,282343.6},{24.5,123525.325},{0,0}};
        //return Arrays.asList(expectedOutputs);
        return Arrays.asList(new Object[][]{{9.6,48401.76},{56,282343.6},{24.5,123525.325},{0,0},{-1,-5041.85}});
    }
    
    @Test
	public void testCalculateGoldPrice() {
	
	     //fill code here
	     assertEquals(expectedOutput,service.calculategoldprice(input),0.001);
		
	}

}

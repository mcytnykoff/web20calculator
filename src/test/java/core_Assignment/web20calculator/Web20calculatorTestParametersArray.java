package core_Assignment.web20calculator;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Web20calculatorTestParametersArray {

   @BeforeClass
public static void BeforeClass01() throws Exception  {
   }
   @Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
   public static Collection<String[]> data() throws IOException {
	   core_Assignment.web20calculator.Web20calculator_main web20calculator_main = new core_Assignment.web20calculator.Web20calculator_main();
         return Arrays.asList(web20calculator_main.a2d());
   }

   

 @Parameter(value = 0)
 public String test_id;

 @Parameter(value = 1)
 public String result_Expected;
 
 @Parameter(value = 2)
 public String result_Actual;
 

 @Parameter(value = 3)
 public String N1;
 
 @Parameter(value = 4)
 public String N2;

 @Test
 public void test_Operation_Validation_web20calculator ()  throws ComparisonFailure {
       System.out.println("Test Case: " + test_id + " Expected Result: " + result_Expected + " Actual Result: " + result_Actual );

       
       
       assertEquals("FAILED", result_Expected, result_Actual);
   }

}
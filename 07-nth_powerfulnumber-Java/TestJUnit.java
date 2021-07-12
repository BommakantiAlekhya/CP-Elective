/**
 * This is JUnit that tests the nthPowerfulNumber method that is available in NthPowerfulNumber class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase1).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      	assertEquals("1.", 1000, new NthPowerfulNumber().nthPowerfulNumber(53));
		assertEquals("2.", 576, new NthPowerfulNumber().nthPowerfulNumber(39));
		assertEquals("3.", 343, new NthPowerfulNumber().nthPowerfulNumber(29));
		assertEquals("4.", 128, new NthPowerfulNumber().nthPowerfulNumber(17));
		assertEquals("5.", 144, new NthPowerfulNumber().nthPowerfulNumber(18));
		assertEquals("6.", 169, new NthPowerfulNumber().nthPowerfulNumber(19));
		assertEquals("7.", 16, new NthPowerfulNumber().nthPowerfulNumber(4));
		assertEquals("8.", 25, new NthPowerfulNumber().nthPowerfulNumber(5));
		assertEquals("9.", 27, new NthPowerfulNumber().nthPowerfulNumber(6));
		assertEquals("10.", 32, new NthPowerfulNumber().nthPowerfulNumber(7));
		assertEquals("11.", 36, new NthPowerfulNumber().nthPowerfulNumber(8));
		assertEquals("12.", 49, new NthPowerfulNumber().nthPowerfulNumber(9));
		assertEquals("13.", 64, new NthPowerfulNumber().nthPowerfulNumber(10));
		assertEquals("14.", 1, new NthPowerfulNumber().nthPowerfulNumber(0));
   }
}


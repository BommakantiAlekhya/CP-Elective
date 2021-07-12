/**
 * This is JUnit that tests the method that is available in SumOfSquaresOfDigits class.
 * This contains 1 testcase.
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
		assertEquals("1.", 25, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(5));
		assertEquals("2.", 5, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(12));
		assertEquals("3.", 29, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(234));
		assertEquals("4.", 31, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(234101));
		assertEquals("5.", 29, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(2340));
		assertEquals("6.", 1, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(10));
		assertEquals("7.", 10, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(12012));
		assertEquals("8.", 1, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(1));
		assertEquals("9.", 0, new SumOfSquaresOfDigits().sumOfSquaresOfDigits(0));
   }
}
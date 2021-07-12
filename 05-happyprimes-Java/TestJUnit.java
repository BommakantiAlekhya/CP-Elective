/**
 * This is JUnit that tests the sleepIn method that is available in IsHappyNumber class.
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
		assertEquals("1.", false, new IsHappyNumber().isHappyNumber(2));
		assertEquals("2.", true, new IsHappyNumber().isHappyNumber(23));
		assertEquals("3.", false, new IsHappyNumber().isHappyNumber(1008));
		assertEquals("4.", true, new IsHappyNumber().isHappyNumber(31));
		assertEquals("5.", false, new IsHappyNumber().isHappyNumber(940));
		assertEquals("6.", true, new IsHappyNumber().isHappyNumber(19));
		assertEquals("7.", false, new IsHappyNumber().isHappyNumber(1000));
		assertEquals("8.", true, new IsHappyNumber().isHappyNumber(331));
		assertEquals("9.", false, new IsHappyNumber().isHappyNumber(1418854));
		assertEquals("10.", true, new IsHappyNumber().isHappyNumber(709));
		assertEquals("11.", false, new IsHappyNumber().isHappyNumber(6));
		assertEquals("12.", true, new IsHappyNumber().isHappyNumber(833));
   }
}
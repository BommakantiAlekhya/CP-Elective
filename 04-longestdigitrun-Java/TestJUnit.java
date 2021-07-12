/**
 * This is JUnit that tests the method that is available in LongestDigitRun class.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase2).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals("1.", 7, new LongestDigitRun().longestDigitRun(117773732));
      assertEquals("2.", 5, new LongestDigitRun().longestDigitRun(11455567));
      assertEquals("3.", 1, new LongestDigitRun().longestDigitRun(12345));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 7, new LongestDigitRun().longestDigitRun(-677886));
      assertEquals("2.", 1, new LongestDigitRun().longestDigitRun(44332211));
      assertEquals("3.", 0, new LongestDigitRun().longestDigitRun(3330001));
   }
}
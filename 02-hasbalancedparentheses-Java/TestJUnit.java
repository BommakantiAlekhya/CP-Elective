/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 1 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Deeapk
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals("1.", true, new BalancedParenthesis().isParenthesisBalanced("()"));
      assertEquals("2.", false, new BalancedParenthesis().isParenthesisBalanced("((())"));
      assertEquals("3.", false, new BalancedParenthesis().isParenthesisBalanced(")))(((("));
      assertEquals("4.", true, new BalancedParenthesis().isParenthesisBalanced(""));
   }
}
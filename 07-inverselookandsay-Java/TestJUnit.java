/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals("1.", new int[0], new InverseLookAndSay().inverseLookAndSay("[]"));
      assertArrayEquals("2.", new int[]{1, 1, 1}, new InverseLookAndSay().inverseLookAndSay("[(3, 1)]"));
      assertArrayEquals("3.", new int[]{-1, 2, 7}, new InverseLookAndSay().inverseLookAndSay("[(1, -1), (1, 2), (1, 7)]"));
   }

   @Test
   public void testCase2() {
      assertArrayEquals("1.", new int[]{3, 3, 8, -10, -10, -10}, new InverseLookAndSay().inverseLookAndSay("[(2, 3), (1, 8), (3, -10)]"));
      assertArrayEquals("2.", new int[]{3, 3, 8, 3, 3, 3, 3}, new InverseLookAndSay().inverseLookAndSay("[(2, 3), (1, 8), (4, 3)]"));
   }
}
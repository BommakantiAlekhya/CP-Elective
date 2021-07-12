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
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   HandToDice handToDice = new HandToDice();
   @Test
   public void testCase1() {
      assertEquals("1.", java.util.Arrays.toString(new int[]{1, 2, 3}), java.util.Arrays.toString(handToDice.handToDice(123)));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", java.util.Arrays.toString(new int[]{2, 1, 4}), java.util.Arrays.toString(handToDice.handToDice(214)));
   }

   @Test
   public void testCase3() {
      assertEquals("1.", java.util.Arrays.toString(new int[]{4, 2, 2}), java.util.Arrays.toString(handToDice.handToDice(422)));
   }

   @Test
   public void testCase4() {
      assertEquals("1.", java.util.Arrays.toString(new int[]{4, 0, 0}), java.util.Arrays.toString(handToDice.handToDice(400)));
   }

   @Test
   public void testCase5() {
      assertEquals("1.", java.util.Arrays.toString(new int[]{1, 0, 1}), java.util.Arrays.toString(handToDice.handToDice(101)));
   }
}
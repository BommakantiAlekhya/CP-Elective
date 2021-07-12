/**
 * This is JUnit that tests the method that is available in SecondLargest class.
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
      assertEquals("1.", new Integer(4), new SecondLargest().secondLargest(new int[]{1, 2, 3, 4, 5}));
      assertEquals("2.", new Integer(3), new SecondLargest().secondLargest(new int[]{4, 3}));
      assertEquals("3.", new Integer(4), new SecondLargest().secondLargest(new int[]{4, 4, 3}));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", new Integer(-4), new SecondLargest().secondLargest(new int[]{-3, -4}));
      assertEquals("2.", null, new SecondLargest().secondLargest(new int[]{4}));
      assertEquals("3.", null, new SecondLargest().secondLargest(new int[0]));
   }
}
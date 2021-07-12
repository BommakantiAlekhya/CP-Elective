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
   TriangleAreaByCoordinates ta = new TriangleAreaByCoordinates();
   
   @Test
   public void testCase1() {
      assertEquals("1.", 222, ta.triangleAreaByCoordinates(23, 30, 15, 15, 50, 25));
      assertEquals("2.", 127, ta.triangleAreaByCoordinates(23, 30, 15, 15, 32, 15));
      assertEquals("3.", 170, ta.triangleAreaByCoordinates(15, 35, 15, 15, 32, 15));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 190, ta.triangleAreaByCoordinates(25, 35, 15, 15, 34, 15));
      assertEquals("2.", 19, ta.triangleAreaByCoordinates(25, 17, 15, 15, 34, 15));
   }
}
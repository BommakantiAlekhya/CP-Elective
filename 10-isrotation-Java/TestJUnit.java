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
   @Test
   public void testCase1() {
      assertEquals("1.", true, new IsRotation().isRotation(3412, 1234));
      assertEquals("2.", true, new IsRotation().isRotation(1234, 1234));
      assertEquals("3.", false, new IsRotation().isRotation(3142, 1234));
      assertEquals("4.", true, new IsRotation().isRotation(12345, 54321));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", false, new IsRotation().isRotation(12345, 4321));
      assertEquals("2.", false, new IsRotation().isRotation(10010, 10100));
      assertEquals("3.", false, new IsRotation().isRotation(101111, 11110));
      assertEquals("4.", false, new IsRotation().isRotation(12345678, 43125678));
   }
}
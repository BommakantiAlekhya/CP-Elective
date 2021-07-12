/**
 * This is JUnit that tests the method that is available in PowersOf3ToN class.
 * This contains 2testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase2).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals("1.", new int[0], new PowersOf3ToN().powersOf3ToN(0));
      assertArrayEquals("2.", new int[0], new PowersOf3ToN().powersOf3ToN(-42));
      assertArrayEquals("3.", new int[0], new PowersOf3ToN().powersOf3ToN(0.99));
      assertArrayEquals("4.", new int[]{1}, new PowersOf3ToN().powersOf3ToN(1));
      assertArrayEquals("5.", new int[]{1, 3}, new PowersOf3ToN().powersOf3ToN(3));
   }

   @Test
   public void testCase2() {
      assertArrayEquals("1.", new int[]{1, 3}, new PowersOf3ToN().powersOf3ToN(8.9999));
      assertArrayEquals("2.", new int[]{1, 3, 9}, new PowersOf3ToN().powersOf3ToN(9));
      assertArrayEquals("3.", new int[]{1, 3, 9}, new PowersOf3ToN().powersOf3ToN(9.1111));
      assertArrayEquals("4.", new int[]{1, 3, 9, 27, 81}, new PowersOf3ToN().powersOf3ToN(100));
   }
}
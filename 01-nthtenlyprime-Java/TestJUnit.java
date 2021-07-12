/**
 * This is JUnit that tests the tenlyprime method that is available in Prime class.
 * This contains 1 testcases.
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
      assertEquals("1.", 19, new Prime().nthTenlyPrime(1));
      assertEquals("2.", 37, new Prime().nthTenlyPrime(2));
      assertEquals("3.", 73, new Prime().nthTenlyPrime(3));
      assertEquals("4.", 109, new Prime().nthTenlyPrime(4));
      assertEquals("5.", 127, new Prime().nthTenlyPrime(5));
   }
}
/**
 * This JUnit tests the methods of the MyMath class.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase3).
 * 
 * @author: Deepak
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      MyMath s = new MyMath();
      assertEquals("1.", 1, s.nthFibonacciNumber(0));
      assertEquals("2.", 1, s.nthFibonacciNumber(1));
      assertEquals("3.", 2, s.nthFibonacciNumber(2));
      assertEquals("4.", 3, s.nthFibonacciNumber(3));
      assertEquals("5.", 5, s.nthFibonacciNumber(4));
      assertEquals("6.", 8, s.nthFibonacciNumber(5));
   }

   @Test
   public void testCase2() {
      MyMath s = new MyMath();
      assertEquals("1.", 13, s.nthFibonacciNumber(6));
      assertEquals("2.", 21, s.nthFibonacciNumber(7));
      assertEquals("3.", 34, s.nthFibonacciNumber(8));
      assertEquals("4.", 55, s.nthFibonacciNumber(9));
      assertEquals("5.", 89, s.nthFibonacciNumber(10));
      assertEquals("6.", 144, s.nthFibonacciNumber(11));
   }
}


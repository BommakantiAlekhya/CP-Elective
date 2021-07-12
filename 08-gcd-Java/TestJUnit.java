/**
 * This JUnit tests the MyMath class methods.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy
 * and paste the testcase2 along with the annotation @test
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", 1, new MyMath().gcd(2, 3));
      assertEquals("2.", 5, new MyMath().gcd(1000, 12345));
      assertEquals("3.", 5, new MyMath().gcd(1000000, 999995));
      assertEquals("4.", 2, new MyMath().gcd(1000000,999994));
      assertEquals("5.", 7, new MyMath().gcd(88886, 474747));
      assertEquals("6.", 1, new MyMath().gcd(151, 139));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 13, new MyMath().gcd(14456, 143));
      assertEquals("2.", 57, new MyMath().gcd(155667, 54321));
      assertEquals("3.", 1, new MyMath().gcd(24323, 53245));
      assertEquals("4.", 1, new MyMath().gcd(0, 1));
      assertEquals("5.", 1, new MyMath().gcd(1, 0));
   }
}
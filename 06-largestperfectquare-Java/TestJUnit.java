/**
 * This JUnit tests the MyMath class methods.
 * This contains 4 testcases.
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
		assertEquals("1.", 16, new MyMath().largestPerfectSquare(24));
      assertEquals("2.", 25, new MyMath().largestPerfectSquare(25));
      assertEquals("3.", 25, new MyMath().largestPerfectSquare(26));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 9, new MyMath().largestPerfectSquare(14));
      assertEquals("2.", 1, new MyMath().largestPerfectSquare(2));
      assertEquals("3.", 4, new MyMath().largestPerfectSquare(5));
   }
}
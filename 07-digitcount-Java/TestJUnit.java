/**
 * This JUnit tests the MyMath class methods.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the testcase2 along with the annotation @test
 * 
 * @author: Siva Sankar
 */


import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", 2, new MyMath().digitCount(-24));
      assertEquals("2.", 1, new MyMath().digitCount(0));
      assertEquals("3.", 2, new MyMath().digitCount(26));
      assertEquals("4.", 8, new MyMath().digitCount(-52311231));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 2, new MyMath().digitCount(14));
      assertEquals("2.", 1, new MyMath().digitCount(2));
      assertEquals("3.", 1, new MyMath().digitCount(5));
      assertEquals("4.", 8, new MyMath().digitCount(52311231));
   }
}
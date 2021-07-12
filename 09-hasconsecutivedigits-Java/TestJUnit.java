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
		assertEquals("1.", false, new MyMath().hasConsecutiveDigits(-24));
      assertEquals("2.", false, new MyMath().hasConsecutiveDigits(0));
      assertEquals("3.", true, new MyMath().hasConsecutiveDigits(26011));
      assertEquals("4.", false, new MyMath().hasConsecutiveDigits(14));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", true, new MyMath().hasConsecutiveDigits(-11023));
      assertEquals("2.", false, new MyMath().hasConsecutiveDigits(2));
      assertEquals("3.", false, new MyMath().hasConsecutiveDigits(5));
      assertEquals("4.", true, new MyMath().hasConsecutiveDigits(52311231));
      assertEquals("5.", true, new MyMath().hasConsecutiveDigits(-52311231));
   }
}
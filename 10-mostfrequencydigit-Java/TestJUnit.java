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
		assertEquals("1.", 2, new MyMath().mostFrequentDigit(24));
      assertEquals("2.", 0, new MyMath().mostFrequentDigit(0));
      assertEquals("3.", 1, new MyMath().mostFrequentDigit(26011));
      assertEquals("4.", 0, new MyMath().mostFrequentDigit(1102300));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 1, new MyMath().mostFrequentDigit(14));
      assertEquals("2.", 2, new MyMath().mostFrequentDigit(2));
      assertEquals("3.", 5, new MyMath().mostFrequentDigit(5));
      assertEquals("4.", 1, new MyMath().mostFrequentDigit(52311231));
      assertEquals("5.", 5, new MyMath().mostFrequentDigit(52355235));
   }
}
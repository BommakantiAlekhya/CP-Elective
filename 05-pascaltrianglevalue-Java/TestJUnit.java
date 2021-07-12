/**
 * This is JUnit that tests the methods of the Clock.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Deepak
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      PascalTriangle s = new PascalTriangle();
      assertEquals("1.", 1, s.pascalsTriangleValue(1,1));
      assertEquals("2.", 0, s.pascalsTriangleValue(3,5));
      assertEquals("3.", 3, s.pascalsTriangleValue(3,1));
      assertEquals("4.", 10, s.pascalsTriangleValue(5,2));
    }

   @Test
   public void testCase2() {
      PascalTriangle s = new PascalTriangle();
      assertEquals("1.", 20, s.pascalsTriangleValue(6, 3));
      assertEquals("2.", 15, s.pascalsTriangleValue(6, 2));
      assertEquals("3.", 35, s.pascalsTriangleValue(7, 4));
      assertEquals("4.", 0, s.pascalsTriangleValue(7, 9));  
   }
}


/**
 * This JUnit tests the methods of the MyMath class methods.
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
      assertEquals("1.", 6, s.threeLinesArea(5,3,4));
      assertEquals("2.", 5, s.threeLinesArea(4,4,3));
   }

   @Test
   public void testCase2() {
      MyMath s = new MyMath();
      assertEquals("1.", 39, s.threeLinesArea(12,10,8));
      assertEquals("2.", 65, s.threeLinesArea(16,12,11));
   }
}


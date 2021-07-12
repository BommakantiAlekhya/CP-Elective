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
      CirclesIntersect s = new CirclesIntersect();
      assertEquals("1.", true, s.circlesIntersect(-10, 8, 30, 14, -24, 10));
      assertEquals("2.", false, s.circlesIntersect(3, 4, 5, 14, 18, 8));
      
    }

   @Test
   public void testCase2() {
      CirclesIntersect s = new CirclesIntersect();
      assertEquals("1.", false, s.circlesIntersect(2, 3, 12, 15, 28, 10));
      assertEquals("2.", true, s.circlesIntersect(5, 6, 14, 8, 7, 9));  
   }
}
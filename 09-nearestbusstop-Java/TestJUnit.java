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
      NearestBusStop s = new NearestBusStop();
      assertEquals("1.", 8, s.nearestBusStop(12));
      assertEquals("2.", 16, s.nearestBusStop(13));
      assertEquals("3.", 8, s.nearestBusStop(5));
    }

   @Test
   public void testCase2() {
      NearestBusStop s = new NearestBusStop();
      assertEquals("1.", 0, s.nearestBusStop(4));
      assertEquals("2.", 8, s.nearestBusStop(8));
      assertEquals("3.", 0, s.nearestBusStop(0));
      assertEquals("4.", 16, s.nearestBusStop(16));  
   }
}
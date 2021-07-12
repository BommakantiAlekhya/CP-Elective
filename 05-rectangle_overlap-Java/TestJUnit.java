/**
 * This JUnit tests the methods of the MyMath class method.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the TestCase2 including the annotation @test.
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
      Rectangle s = new Rectangle();
      assertEquals("1.", true, s.rectangleOverlap(0,2,1,4,1,6,8,4));
      assertEquals("2.", false, s.rectangleOverlap(0,3,1,4,20,22,6,3));
   }

   @Test
   public void testCase2() {
      Rectangle s = new Rectangle();
      assertEquals("1.", false, s.rectangleOverlap(5,12,11,14,31,36,8,4));
      assertEquals("2.", true, s.rectangleOverlap(0,0,1,4,1,4,1,2));
   }
}


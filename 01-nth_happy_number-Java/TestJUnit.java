/**
 * This JUnit tests the MyMath class methods.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy 
 * and paste the testcase2 along with the annotation @test and
 * change the copied testcase2 to testcase3
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
      HappyNumber s = new HappyNumber();
      assertEquals("1.", 1, s.nthHappyNumber(1));
      assertEquals("2.", 7, s.nthHappyNumber(2));
      assertEquals("3.", 10, s.nthHappyNumber(3));
      assertEquals("4.", 13, s.nthHappyNumber(4));
   }

   @Test
   public void testCase2() {
      HappyNumber s = new HappyNumber();
      assertEquals("1.", 19, s.nthHappyNumber(5));
      assertEquals("2.", 23, s.nthHappyNumber(6)); 
      assertEquals("3.", 28, s.nthHappyNumber(7)); 
      assertEquals("4.", 31, s.nthHappyNumber(8)); 
   }
}


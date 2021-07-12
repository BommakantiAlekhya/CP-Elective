/**
 * This JUnit tests the MyMath class methods.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy 
 * and paste the testcase2 along with the annotation @test and
 * change the copied testcase2 to testcase3
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", false, new HappyNumber().isHappyNumber(-7));
      assertEquals("2.", true, new HappyNumber().isHappyNumber(1));
      assertEquals("3.", false, new HappyNumber().isHappyNumber(2));
      assertEquals("4.", false, new HappyNumber().isHappyNumber(98));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", false, new HappyNumber().isHappyNumber(405));
      assertEquals("2.", true, new HappyNumber().isHappyNumber(97));
      assertEquals("3.", true, new HappyNumber().isHappyNumber(404));
      assertEquals("4.", false, new HappyNumber().isHappyNumber(0));
   }
}
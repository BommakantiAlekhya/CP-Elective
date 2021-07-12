/**
 * This is JUnit that tests the number of pool ball rows in a PoolBall game.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase2).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      PoolBall pb = new PoolBall();
		assertEquals("1.", 1, pb.numberofpoolballrows(1));
      assertEquals("2.", 2, pb.numberofpoolballrows(3));
      assertEquals("3.", 3, pb.numberofpoolballrows(6));
      assertEquals("4.", 4, pb.numberofpoolballrows(10));
      assertEquals("5.", 5, pb.numberofpoolballrows(15));
      assertEquals("6.", 6, pb.numberofpoolballrows(21));
      assertEquals("7.", 7, pb.numberofpoolballrows(28));
      assertEquals("8.", 8, pb.numberofpoolballrows(36));
      assertEquals("9.", 9, pb.numberofpoolballrows(45));
      assertEquals("10.", 10, pb.numberofpoolballrows(46));
      assertEquals("11.", 9, pb.numberofpoolballrows(44));
   }

   @Test
   public void testCase2() {
      PoolBall pb = new PoolBall();
      assertEquals("1.", 10, pb.numberofpoolballrows(55));
      assertEquals("2.", 11, pb.numberofpoolballrows(66));
      assertEquals("3.", 12, pb.numberofpoolballrows(78));
      assertEquals("4.", 13, pb.numberofpoolballrows(91));
      assertEquals("5.", 14, pb.numberofpoolballrows(105));
      assertEquals("6.", 15, pb.numberofpoolballrows(120));
      assertEquals("7.", 100, pb.numberofpoolballrows(5050));
      assertEquals("8.", 1000, pb.numberofpoolballrows(500500));
   }
}
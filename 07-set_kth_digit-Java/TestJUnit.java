/**
 * This is JUnit that tests the methods of the setKthDigit in MyMath.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
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
      assertEquals("1.", 461, s.setKthDigit(468, 0, 1));
      assertEquals("2.", 418, s.setKthDigit(468, 1, 1));
      assertEquals("3.", 168, s.setKthDigit(468, 2, 1));
    }

   @Test
   public void testCase2() {
      MyMath s = new MyMath();
      assertEquals("1.", 1468, s.setKthDigit(468, 3, 1));
      assertEquals("2.", -1468, s.setKthDigit(-468, 3, 1));
      assertEquals("1.", 468, s.setKthDigit(468, 5, 1));
   }
}

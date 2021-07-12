/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", true, new IsRotated().isRotated("XYZ", "ZXY"));
      assertEquals("2.", false, new IsRotated().isRotated("12345", "54321"));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", true, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZA"));
      assertEquals("2.", true, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "JKLMNOPQRSTUVWXYZABCDEFGHI"));
      assertEquals("3.", false, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ACDEFGHIJKLMNOPQRSTUVWXYZB"));
      assertEquals("4.", false, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "BCDEFGHIJKLMNOPQRSTUVWXYZZ"));
      assertEquals("5.", false, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNPQRSTUVWXYZ"));
      assertEquals("6.", false, new IsRotated().isRotated("ABCDEFGHIJKLMNOPQRSUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
   }
}

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
		assertEquals("1.", 3, new carrylessadd().fun_carrylessadd(1,2));
      assertEquals("2.", 51, new carrylessadd().fun_carrylessadd(785, 376));
      assertEquals("3.", 90, new carrylessadd().fun_carrylessadd(99, 1));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 0, new carrylessadd().fun_carrylessadd(33,77));
      assertEquals("2.", 121, new carrylessadd().fun_carrylessadd(121,0));
   }
}
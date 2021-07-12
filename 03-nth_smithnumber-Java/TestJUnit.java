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
		assertEquals("1.", 4, new nth_smithnumber().fun_nth_smithnumber(0));
      assertEquals("2.", 22, new nth_smithnumber().fun_nth_smithnumber(1));
      assertEquals("3.", 27, new nth_smithnumber().fun_nth_smithnumber(2));
      assertEquals("4.", 94, new nth_smithnumber().fun_nth_smithnumber(5));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", 274, new nth_smithnumber().fun_nth_smithnumber(10));
      assertEquals("2.", 382, new nth_smithnumber().fun_nth_smithnumber(15));
      assertEquals("3.", 438, new nth_smithnumber().fun_nth_smithnumber(17));
      assertEquals("4.", 483, new nth_smithnumber().fun_nth_smithnumber(19));
   }
}
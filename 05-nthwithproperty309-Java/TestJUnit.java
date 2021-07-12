/**
 * This is JUnit that tests the method that is available in NthWithProperty309 class.
 * This contains 3 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase3).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
        assertEquals("1,", 309, new NthWithProperty309().nthWithProperty309(0));
        assertEquals("2,", 1, new NthWithProperty309().nthWithProperty309(418));
        assertEquals("3,", 2, new NthWithProperty309().nthWithProperty309(462));
        assertEquals("4,", 3, new NthWithProperty309().nthWithProperty309(474));
   }
   @Test
   public void testCase2() {
        assertEquals("1,", 4, new NthWithProperty309().nthWithProperty309(575));
        assertEquals("2,", 5, new NthWithProperty309().nthWithProperty309(635));
        assertEquals("3,", 6, new NthWithProperty309().nthWithProperty309(662));
        assertEquals("4,", 100, new NthWithProperty309().nthWithProperty309(2014));
   }
   @Test
   public void testCase3() {
        assertEquals("1.", 1000, new NthWithProperty309().nthWithProperty309(7813));
   }
}

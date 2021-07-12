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
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals("1.", "[(2, f), (0, a)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'a'));
      assertEquals("2.", "[(2, f), (0, a), (1, c)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'c'));
      assertEquals("3.", "[(2, f)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'f'));
      assertEquals("4.", "[(2, f), (4, m), (3, g)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'g'));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", "[(2, f), (4, m)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'm'));
      assertEquals("2.", "[(2, f), (4, m), (5, q)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'q'));
      assertEquals("3.", "[(2, f), (4, m), (5, q)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'z'));
      assertEquals("4.", "[(2, f), (0, a), (1, c)]", new BinarySearchValues().binarySearchValues(new char[]{'a', 'c', 'f', 'g', 'm', 'q'}, 'b'));
   }
}

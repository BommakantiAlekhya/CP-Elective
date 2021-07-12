/**
 * This is JUnit that tests the hasDuplicates method that is available in HasDuplicates class.
 * This contains 1 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase2).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertEquals("1.", false, new HasDuplicates().hasDuplicates(new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}));
      assertEquals("2.", true, new HasDuplicates().hasDuplicates(new int[][]{{2, 7, 9}, {9, 5, 1}, {4, 3, 8}}));
      assertEquals("3.", false, new HasDuplicates().hasDuplicates(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
      assertEquals("4.", false, new HasDuplicates().hasDuplicates(new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12},{4, 15, 14, 1}}));
      assertEquals("5.", true, new HasDuplicates().hasDuplicates(new int[][]{{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12},{4, 15, 14, 11}}));
   }
}

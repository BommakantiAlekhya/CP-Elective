/**
 * This JUnit tests the Sort class methods.
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
      assertEquals("1.", true, new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5}));
      assertEquals("2.", true, new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
      assertEquals("3.", true, new IsSorted().isSorted(new double[]{1}));
      assertEquals("4.", true, new IsSorted().isSorted(new double[]{1, 1}));
      assertEquals("5.", true, new IsSorted().isSorted(new double[]{}));
      assertEquals("6.", false, new IsSorted().isSorted(new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 10}));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", true, new IsSorted().isSorted(new double[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
      assertEquals("1.", false, new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5.5, 5.1, 7, 8, 9, 10}));
      assertEquals("1.", false, new IsSorted().isSorted(new double[]{1, 2, 3, 4, 5.5, 5.5, 5.5, 5.5, -1, 10}));
      assertEquals("1.", false, new IsSorted().isSorted(new double[]{10, -1, 5.5, 5.5, 5.5, 4, 3, 2, 1}));
      assertEquals("1.", false, new IsSorted().isSorted(new double[]{-1, 0, -1.1}));
   }
}

/**
 * This is JUnit that tests the method that is available in MatrixAdd class.
 * This contains 1 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase1).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      assertArrayEquals("1.", new int[][]{{22, 24, 26},{28, 30, 32}}, new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}}, new int[][]{{21, 22, 23}, {24, 25, 26}}));
      assertArrayEquals("2.", new int[][]{{2, 4, 6},{8, 10, 12}, {14, 16, 18}}, new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}, {7, 8, 9}}, new int[][]{{1,  2,  3},{4,  5,  6}, {7, 8, 9}}));
      assertArrayEquals("3.", null, new MatrixAdd().matrixAdd(new int[][]{{1,  2,  3},{4,  5,  6}}, new int[][]{{21, 22, 23}, {24, 25}}));
   }
}


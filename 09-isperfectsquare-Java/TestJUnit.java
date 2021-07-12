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
		MyMath mm = new MyMath();
		assertEquals("1.", false, mm.isPerfectSquare(-625));
		assertEquals("2.", true, mm.isPerfectSquare(625));
		assertEquals("3.", true, mm.isPerfectSquare(4));
		assertEquals("4.", true, mm.isPerfectSquare(100));
		assertEquals("5.", false, mm.isPerfectSquare(1100));
		assertEquals("6.", false, mm.isPerfectSquare(-100));
		assertEquals("7.", true, mm.isPerfectSquare(0));
	}
}

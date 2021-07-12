/**
 * This is JUnit that tests the LCS method that is available in LCS class.
 * This contains 1 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase1).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", "cde", new LongestCommonSubString().longestCommonSubstring("abcdef", "abqrcdest"));
		assertEquals("2.", "", new LongestCommonSubString().longestCommonSubstring("abcdef", "ghi"));
		assertEquals("3.", "AB", new LongestCommonSubString().longestCommonSubstring("abABC", "abcAB"));
		assertEquals("4.", "cde", new LongestCommonSubString().longestCommonSubstring("abcdef", "abqrcdest"));
		assertEquals("5.", "", new LongestCommonSubString().longestCommonSubstring("abcdef", "ghi"));
		assertEquals("6.", "", new LongestCommonSubString().longestCommonSubstring("", "abqrcdest"));
		assertEquals("7.", "", new LongestCommonSubString().longestCommonSubstring("abcdef", ""));
		assertEquals("8.", "AB", new LongestCommonSubString().longestCommonSubstring("abcABC", "zzabZZAB"));
   }
}
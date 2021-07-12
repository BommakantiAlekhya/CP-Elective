/**
 * This is JUnit that tests the samechars method that is available in SameChars class.
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
		assertEquals("1.", true, new SameChars().sameChars("abcabcabc", "cba"));
		assertEquals("2.", false, new SameChars().sameChars("abcabcabc", "cbad"));
		assertEquals("3.", false, new SameChars().sameChars("abcabcabc", "cBa"));
		assertEquals("4.", false, new SameChars().sameChars("42","The other parameter is not a string"));
		assertEquals("5.", true, new SameChars().sameChars("",""));
   }
}
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
		assertEquals("1.", "be", new LeastFrequentLetters().leastFrequentLetters("aDq efQ? FB'daf!!!"));
		assertEquals("2.", "", new LeastFrequentLetters().leastFrequentLetters("?'!!"));
		assertEquals("3.", "bd", new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!"));
		assertEquals("4.", "bd", new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!".toLowerCase()));
		assertEquals("5.", "bd", new LeastFrequentLetters().leastFrequentLetters("abc def! GFE'cag!!!".toUpperCase()));
		assertEquals("6.", "", new LeastFrequentLetters().leastFrequentLetters(""));
   }

}


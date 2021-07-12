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
		assertEquals("1.", 0, new NthAutomorphicNumbers().nthAutomorphicNumbers(1));
		assertEquals("1.", 1, new NthAutomorphicNumbers().nthAutomorphicNumbers(2));
		assertEquals("1.", 5, new NthAutomorphicNumbers().nthAutomorphicNumbers(3));
		assertEquals("1.", 6, new NthAutomorphicNumbers().nthAutomorphicNumbers(4));
		assertEquals("1.", 25, new NthAutomorphicNumbers().nthAutomorphicNumbers(5));
		assertEquals("1.", 76, new NthAutomorphicNumbers().nthAutomorphicNumbers(6));
		assertEquals("1.", 376, new NthAutomorphicNumbers().nthAutomorphicNumbers(7));
		assertEquals("1.", 625, new NthAutomorphicNumbers().nthAutomorphicNumbers(8));
		assertEquals("1.", 9376, new NthAutomorphicNumbers().nthAutomorphicNumbers(9));
		assertEquals("1.", 90625, new NthAutomorphicNumbers().nthAutomorphicNumbers(10));
		assertEquals("1.", 109376, new NthAutomorphicNumbers().nthAutomorphicNumbers(11));
		assertEquals("1.", 890625, new NthAutomorphicNumbers().nthAutomorphicNumbers(12));
		assertEquals("1.", 2890625, new NthAutomorphicNumbers().nthAutomorphicNumbers(13));
		assertEquals("1.", 7109376, new NthAutomorphicNumbers().nthAutomorphicNumbers(14));
		assertEquals("1.", 12890625, new NthAutomorphicNumbers().nthAutomorphicNumbers(15));
		assertEquals("1.", 87109376, new NthAutomorphicNumbers().nthAutomorphicNumbers(16));
		assertEquals("1.", 212890625, new NthAutomorphicNumbers().nthAutomorphicNumbers(17));
		assertEquals("1.", 787109376, new NthAutomorphicNumbers().nthAutomorphicNumbers(18));
		assertEquals("1.", 1787109376, new NthAutomorphicNumbers().nthAutomorphicNumbers(19));
		assertEquals("1.", 8212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(20));
		assertEquals("1.", 18212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(21));
		assertEquals("1.", 81787109376L, new NthAutomorphicNumbers().nthAutomorphicNumbers(22));
		assertEquals("1.", 918212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(23));
		assertEquals("1.", 9918212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(24));
		assertEquals("1.", 40081787109376L, new NthAutomorphicNumbers().nthAutomorphicNumbers(25));
		assertEquals("1.", 59918212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(26));
		assertEquals("1.", 259918212890625L, new NthAutomorphicNumbers().nthAutomorphicNumbers(27));
		assertEquals("1.", 740081787109376L, new NthAutomorphicNumbers().nthAutomorphicNumbers(28));
   }

}


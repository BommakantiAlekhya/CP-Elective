/**
 * This is JUnit that tests the sleepIn method that is available in SleepIn class.
 * This contains 4 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase4).
 * 
 * @author: Deepak
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
   	StringKeys s = new StringKeys();
   	assertEquals("1.", 8568, s.calculate_hash_value("UDACITY"));
   	assertEquals("2.", -1, s.lookup("UDACITY"));
   }
   @Test
   public void testCase2() {
   	StringKeys s = new StringKeys();
   	assertEquals("1.", 8568, s.calculate_hash_value("UDACITY"));
   	assertEquals("2.", -1, s.lookup("UDACITY"));
   	s.store("UDACITY");
   	assertEquals("3.", 8568, s.lookup("UDACITY"));
   }
   @Test
   public void testCase3() {
   	StringKeys s = new StringKeys();
   	assertEquals("1.", 8568, s.calculate_hash_value("UDACIOUS"));
   	assertEquals("2.", -1, s.lookup("UDACIOUS"));
   }
   @Test
   public void testCase4() {
   	StringKeys s = new StringKeys();
   	assertEquals("1.", 8568, s.calculate_hash_value("UDACIOUS"));
   	assertEquals("2.", -1, s.lookup("UDACIOUS"));
   	s.store("UDACIOUS");
   	assertEquals("3.", 8568, s.lookup("UDACIOUS"));
   }
}
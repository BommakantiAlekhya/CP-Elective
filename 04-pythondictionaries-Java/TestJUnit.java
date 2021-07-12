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
		HashtablePlay hPlay = new HashtablePlay();
   		List<String> location = new ArrayList<String>();
   		location.add("Bangalore - India");
   		location.add("Shanghai - China");
		assertEquals("1.", location, hPlay.alphaUSA());
   }

   @Test
   public void testCase2() {
		HashtablePlay hPlay = new HashtablePlay();
   		List<String> location = new ArrayList<String>();
   		location.add("Atlanta");
   		location.add("Mountain View");
		assertEquals("1.", location, hPlay.sortAsia());
   }
}
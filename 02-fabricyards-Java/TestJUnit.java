/**
 * This JUnit tests the methods of the FabricUtil.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase2).
 * 
 * @author: Deepak
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.beans.Transient;

public class TestJUnit {

   @Test
   public void testCase1() {
      FabricUitl s = new FabricUitl();
      assertEquals("1.", 0, s.fabricYards(0));
      assertEquals("2.", 1, s.fabricYards(1));
      assertEquals("3.", 1, s.fabricYards(35));
      assertEquals("4.", 1, s.fabricYards(36));
      assertEquals("5.", 2, s.fabricYards(37));
      assertEquals("6.", 2, s.fabricYards(38));
      assertEquals("7.", 2, s.fabricYards(72));
      assertEquals("8.", 3, s.fabricYards(73));
   }

   @Test
   public void testCase2() {
      FabricUitl s = new FabricUitl();
      assertEquals("1.", 0, s.fabricExcess(0));
      assertEquals("2.", 35, s.fabricExcess(1));
      assertEquals("3.", 1, s.fabricExcess(35));
      assertEquals("4.", 0, s.fabricExcess(36));
      assertEquals("5.", 35, s.fabricExcess(37));
      assertEquals("6.", 34, s.fabricExcess(38));
      assertEquals("7.", 0, s.fabricExcess(72));
      assertEquals("8.", 35, s.fabricExcess(73));
   }
}


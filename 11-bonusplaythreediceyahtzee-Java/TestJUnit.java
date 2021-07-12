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
import static org.junit.Assert.assertArrayEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
      BonusPlayThreeDiceYahtzee bp = new BonusPlayThreeDiceYahtzee();
		assertArrayEquals("1.",new int[]{432, 4}, bp.bonusPlayThreeDiceYahtzee(2312413));
      assertArrayEquals("2.",new int[]{532, 5}, bp.bonusPlayThreeDiceYahtzee(2315413));
      assertArrayEquals("3.",new int[]{443, 18}, bp.bonusPlayThreeDiceYahtzee(2345413));
   }

   @Test
   public void testCase2() {
      BonusPlayThreeDiceYahtzee bp = new BonusPlayThreeDiceYahtzee();
      assertArrayEquals("1.",new int[]{633, 16}, bp.bonusPlayThreeDiceYahtzee(2633413));
      assertArrayEquals("2.",new int[]{333, 29}, bp.bonusPlayThreeDiceYahtzee(2333413));
      assertArrayEquals("3.",new int[]{555, 35}, bp.bonusPlayThreeDiceYahtzee(2333555));
   }
}
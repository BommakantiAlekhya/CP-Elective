/**
 * This JUnit tests the HappyNumber class methods.
 * This contains 2 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy 
 * and paste the testcase2 along with the annotation @test and
 * change the copied testcase2 to testcase3
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
      HappyNumber s = new HappyNumber();
      assertEquals("1.", 7, s.nthHappyPrime(1));
      assertEquals("2.", 13, s.nthHappyPrime(2));
      assertEquals("3.", 19, s.nthHappyPrime(3));
   }

   @Test
   public void testCase2() {
      HappyNumber s = new HappyNumber();
      assertEquals("1.", 23, s.nthHappyPrime(4));
      assertEquals("2.", 31, s.nthHappyPrime(5)); 
   }
}


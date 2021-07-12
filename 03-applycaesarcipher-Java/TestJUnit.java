/**
 * This JUnit tests the CeaserCipher class methods.
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
      CeaserCipher s = new CeaserCipher();
      
      assertEquals("1.", "Xf Buubdl Bu Ebxo", s.fun_applycaesarcipher("We Attack At Dawn", 1));
      assertEquals("2.",  "xmbgya", s.fun_applycaesarcipher("zodiac", -2));
      assertEquals("3.", "XYZAUVW", s.fun_applycaesarcipher("ABCDXYZ", -3));
   }

   @Test
   public void testCase2() {
      CeaserCipher s = new CeaserCipher();
      
      assertEquals("1.", "DEFGABC", s.fun_applycaesarcipher("ABCDXYZ", 3));
      assertEquals("2.", "xyzauvw", s.fun_applycaesarcipher("abcdxyz", -3)); 
      assertEquals("2.", "defgabc", s.fun_applycaesarcipher("abcdxyz", 3)); 
   }
}


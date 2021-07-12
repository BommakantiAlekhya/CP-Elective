/**
 * This JUnit tests the MyString class methods.
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
      MyString s = new MyString();
      
      assertEquals("1.", 3, s.vowelCount("Abc def!!! a? yzyzyz!"));
      assertEquals("2.",  3, s.vowelCount("zodiac"));
      assertEquals("3.", 1, s.vowelCount("ABCDXYZ"));
   }

   @Test
   public void testCase2() {
      MyString s = new MyString();
      
      assertEquals("1.", 4, s.vowelCount("Hell123ooo"));
      assertEquals("2.", 10, s.vowelCount("aeiouAeiou  ")); 
   }
}


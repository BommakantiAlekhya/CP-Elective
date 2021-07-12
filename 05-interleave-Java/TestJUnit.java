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
      
      assertEquals("1.", "python", s.interleave("pto", "yhn"));
      assertEquals("2.",  "ac#D!f2", s.interleave("a#", "cD!f2"));
      assertEquals("3.", "hweolrllod", s.interleave("hello", "world"));
   }

   @Test
   public void testCase2() {
      MyString s = new MyString();
      
      assertEquals("1.", "ac#De!23r3f", s.interleave("a#e23r3f", "cD!"));
      assertEquals("2.", "ac#Ds!ffg2jsfdeel klsddjlf", s.interleave("a#sfgjfeel klsddjlf", "cD!f2sd")); 
   }
}


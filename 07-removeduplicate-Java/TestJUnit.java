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
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
		assertEquals("1.", "JavPython", new MyString().removeDuplicate("JavaPython"));
      assertEquals("2.", "HeloWrd", new MyString().removeDuplicate("HelloWorld"));
      assertEquals("3.", "E", new MyString().removeDuplicate("EEE"));
      assertEquals("4.", "a ", new MyString().removeDuplicate("a a "));
   }

   @Test
   public void testCase2() {
      assertEquals("1.", "12", new MyString().removeDuplicate("121212121"));
      assertEquals("2.",  "", new MyString().removeDuplicate(""));
      assertEquals("3.", "Test", new MyString().removeDuplicate("Test"));
      assertEquals("4.", "10", new MyString().removeDuplicate("1001"));
      assertEquals("5.", "10", new MyString().removeDuplicate("11110000"));
   }
}


/**
 * This is JUnit that tests the method that is available in NthCircularPrime class.
 * This contains 1 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and paste the last three 
 * lines of the code (TestCase1).
 * 
 * @author: Siva Sankar
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
   @Test
   public void testCase1() {
        assertEquals("1.", 2, new NthCircularPrime().nthCircularPrime(1));
        assertEquals("1.", 3, new NthCircularPrime().nthCircularPrime(2));
        assertEquals("1.", 5, new NthCircularPrime().nthCircularPrime(3));
        assertEquals("1.", 7, new NthCircularPrime().nthCircularPrime(4)); 
        assertEquals("1.", 13, new NthCircularPrime().nthCircularPrime(5));
        assertEquals("1.", 17, new NthCircularPrime().nthCircularPrime(6));
        assertEquals("1.", 31, new NthCircularPrime().nthCircularPrime(7));
        assertEquals("1.", 37, new NthCircularPrime().nthCircularPrime(8));
        assertEquals("1.", 71, new NthCircularPrime().nthCircularPrime(9));
        assertEquals("1.", 73, new NthCircularPrime().nthCircularPrime(10));
        assertEquals("1.", 79, new NthCircularPrime().nthCircularPrime(11));
        assertEquals("1.", 97, new NthCircularPrime().nthCircularPrime(12)); 
        assertEquals("1.", 113, new NthCircularPrime().nthCircularPrime(13));
        assertEquals("1.", 131, new NthCircularPrime().nthCircularPrime(14));
        assertEquals("1.", 197, new NthCircularPrime().nthCircularPrime(15));
        assertEquals("1.", 199, new NthCircularPrime().nthCircularPrime(16)); 
        assertEquals("1.", 311, new NthCircularPrime().nthCircularPrime(17));
        assertEquals("1.", 337, new NthCircularPrime().nthCircularPrime(18));
        assertEquals("1.", 373, new NthCircularPrime().nthCircularPrime(19));
        assertEquals("1.", 719, new NthCircularPrime().nthCircularPrime(20)); 
        assertEquals("1.", 733, new NthCircularPrime().nthCircularPrime(21));
        assertEquals("1.", 919, new NthCircularPrime().nthCircularPrime(22));
        assertEquals("1.", 971, new NthCircularPrime().nthCircularPrime(23));
        assertEquals("1.", 991, new NthCircularPrime().nthCircularPrime(24)); 
        assertEquals("1.", 1193, new NthCircularPrime().nthCircularPrime(25));
        assertEquals("1.", 1931, new NthCircularPrime().nthCircularPrime(26));
        assertEquals("1.", 3119, new NthCircularPrime().nthCircularPrime(27));
        assertEquals("1.", 3779, new NthCircularPrime().nthCircularPrime(28)); 
        assertEquals("1.", 7793, new NthCircularPrime().nthCircularPrime(29));
        assertEquals("1.", 7937, new NthCircularPrime().nthCircularPrime(30));
        assertEquals("1.", 9311, new NthCircularPrime().nthCircularPrime(31));
        assertEquals("1.", 9377, new NthCircularPrime().nthCircularPrime(32)); 
        assertEquals("1.", 11939, new NthCircularPrime().nthCircularPrime(33));
        assertEquals("1.", 19391, new NthCircularPrime().nthCircularPrime(34));
        assertEquals("1.", 19937, new NthCircularPrime().nthCircularPrime(35));
        assertEquals("1.", 37199, new NthCircularPrime().nthCircularPrime(36));
        assertEquals("1.", 39119, new NthCircularPrime().nthCircularPrime(37));
        assertEquals("1.", 71993, new NthCircularPrime().nthCircularPrime(38));
        assertEquals("1.", 91193, new NthCircularPrime().nthCircularPrime(39));
        assertEquals("1.", 93719, new NthCircularPrime().nthCircularPrime(40));
        assertEquals("1.", 93911, new NthCircularPrime().nthCircularPrime(41));
        assertEquals("1.", 99371, new NthCircularPrime().nthCircularPrime(42));
        assertEquals("1.", 193939, new NthCircularPrime().nthCircularPrime(43));
        assertEquals("1.", 199933, new NthCircularPrime().nthCircularPrime(44));
        assertEquals("1.", 319993, new NthCircularPrime().nthCircularPrime(45));
        assertEquals("1.", 331999, new NthCircularPrime().nthCircularPrime(46));
        assertEquals("1.", 391939, new NthCircularPrime().nthCircularPrime(47));
   }
}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.lang.*;
import java.io.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(JUnit4.class)
public class TestAlphabets {
	
	@Test
	public void testCase1() {

                Alphabets alphabet = new Alphabets();
                assertEquals(alphabet.checkingAlphabets("@!abcdefghijklmnopqrstuvwxyz"),"String contains all alphabets a-z(case insensitive) \n");

		}

	@Test
	public void testCase2() {

                Alphabets alphabet = new Alphabets();
		        assertEquals(alphabet.checkingAlphabets("ftgybj"),"String doesn't contains 26 alphabets");
		        
		}

	@Test
	public void testCase3() {

                Alphabets alphabet = new Alphabets();
		        assertEquals(alphabet.checkingAlphabets(""),"String doesn't contains 26 alphabets");

		}

}

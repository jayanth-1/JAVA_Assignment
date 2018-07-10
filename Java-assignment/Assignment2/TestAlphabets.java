import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.lang.*;
import java.io.*;

@RunWith(JUnit4.class)
public class TestAlphabets {
	
	@Test
	public static void main(String[] args) {

                Alphabets alphabet = new Alphabets();
                assertEquals(alphabet.checkingAlphabets("@!abcdefghijklmnopqrstuvwxyz"),"String contains all alphabets a-z(case insensitive) \n");
		        assertEquals(alphabet.checkingAlphabets("ftgybj"),"String doesn't contains 26 alphabets");
		        assertEquals(alphabet.checkingAlphabets(""),"String doesn't contains 26 alphabets");
		        assertEquals(alphabet.checkingAlphabets(null),"String doesn't contains 26 alphabets");

		}
}

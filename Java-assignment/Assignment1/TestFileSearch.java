import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.lang.*;
import java.io.*;

@RunWith(JUnit4.class)
public class TestPingMedianTime1 {
	
	@Test
	public static void main(String[] args) {
        String directory_name = "/home/zemoso";
        boolean flag = false;
        FileSearch obj = new FileSearch(); 
		assertTrue(obj.searchingFiles(directory_name,"hello.*",flag));
		assertTrue(obj.searchingFiles(directory_name,"[a-z]",flag));
		assertFalse(obj.searchingFiles(directory_name,"*hello",flag));
		
}
}
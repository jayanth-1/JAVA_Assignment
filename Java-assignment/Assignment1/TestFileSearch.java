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
public class TestFileSearch {
	
	@Test
	public void testCase1() {
        String directory_name = "/home/zemoso";
        boolean flag = false;
        FileSearch obj = new FileSearch(); 
		assertTrue(obj.searchingFiles(directory_name,"hello.*",flag));
		
}

    @Test
	public void testCase2() {
        String directory_name = "/home/zemoso";
        boolean flag = false;
        FileSearch obj = new FileSearch(); 
		assertTrue(obj.searchingFiles(directory_name,"[a-z]",flag));
}


    @Test
	public void testCase3() {
        String directory_name = "/home/zemoso";
        boolean flag = false;
        FileSearch obj = new FileSearch(); 
		assertFalse(obj.searchingFiles(directory_name,"*hello",flag));
}
}
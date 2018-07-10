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

		double d1 = 0.9;
		double d2 = 0.8;
		double d3 = (d1 + d2)/2;
		assertEquals(d1,PingMedianTime.oddPing("0.9"));
		assertEquals(d3,PingMedianTime.evenPing("0.9","0.8"));
		assertFalse(PingMedianTime.validate("0.0.1"));
		assertTrue(PingMedianTime.validate("127.0.0.1"));

}
}
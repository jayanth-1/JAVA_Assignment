import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(JUnit4.class)
public class TestPingMedianTime {
	

    @Test
	public void testCase3() {

		assertFalse(PingMedianTime.validateString("0.0.1"));

}

    @Test
	public void testCase4() {

		assertTrue(PingMedianTime.validateString("127.0.0.1"));

}
}
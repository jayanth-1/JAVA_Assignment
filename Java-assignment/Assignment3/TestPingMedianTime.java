import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(JUnit4.class)
public class TestPingMedianTime {
	

    @Test
	public void negativeTestValidate() {

		assertFalse(PingMedianTime.validateString("0.0.1"));

        }

    @Test
	public void positiveTestValidate2() {

		assertTrue(PingMedianTime.validateString("127.0.0.1"));

        }

    @Test
	public void testOddPing() {
                double d1 = 0.9;
		assertEquals(d1,PingMedianTime.oddPingTime("0.9"),0.1);

        }

    @Test
	public void testEvenPing() {
                double d1 = 0.9;
                double d2 = 0.7;
                double d3 = (d1 + d2)/2;
		assertEquals(d3,PingMedianTime.evenPingTime("0.9","0.7"),0.1);

        }

}

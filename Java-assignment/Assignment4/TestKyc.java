import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class TestKyc {
	
	@Test
	public void testCase1() throws Exception{

          assertEquals(Kyc.rangeCalculation("16-07-1998","27-06-2017"),"16-06-2017 27-06-2017");
		
	}
	@Test
	public void testCase2() throws Exception{

          assertEquals(Kyc.rangeCalculation("04-02-2016","04-04-2017"),"05-01-2017 06-03-2017");
          
	}
	@Test
	public void testCase3() throws Exception{

          assertEquals(Kyc.rangeCalculation("04-05-2017","04-04-2017"),"No range");
		
	}
	@Test
	public void testCase4() throws Exception{

          assertEquals(Kyc.rangeCalculation("04-04-2015","04-04-2016"),"05-03-2016 04-04-2016");
          
	}
	@Test
	public void testCase5() throws Exception{

          assertEquals(Kyc.rangeCalculation("04-04-2015","15-03-2016"),"05-03-2016 15-03-2016");

	}
}

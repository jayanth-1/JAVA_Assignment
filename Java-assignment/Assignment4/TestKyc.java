import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.lang.*;
import java.io.*;

@RunWith(JUnit4.class)
public class TestKyc {
	
	@Test
	public static void main(String[] args) throws Exception{

        
        assertEquals(Kyc.rangeCalculation("16-07-1998","27-06-2017"),"16-06-2017 27-06-2017");
        assertEquals(Kyc.rangeCalculation("04-02-2016","04-04-2017"),"05-01-2017 06-03-2017");
        assertEquals(Kyc.rangeCalculation("04-05-2017","04-04-2017"),"No range");
        assertEquals(Kyc.rangeCalculation("04-04-2015","04-04-2016"),"05-03-2016 04-04-2016");
        assertEquals(Kyc.rangeCalculation("04-04-2015","15-03-2016"),"05-03-2016 15-03-2016");

		
	}
}

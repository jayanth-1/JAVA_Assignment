import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestPingMedianTime{

	  public static void main(String[] args)
	  {
	     List<String> neg_testcase = Arrays.asList("0.0","0.85.0");
             List<String> pos_testcase = Arrays.asList("127.0.0.1", "101.0.0.1");
             int i;
             PingMedianTime pingObj = new PingMedianTime();
             System.out.println("Running Positive test case \n\n");
             for(i=0;i<pos_testcase.size();i++)
             {
               System.out.println("test case " + i + " " + pos_testcase.get(i) + "\n");
               System.out.println(pingObj.computeMedian(pos_testcase.get(i),2));
               System.out.println("\n");

    }
             for(i=0;i<neg_testcase.size();i++)
             {
                System.out.println("test case " + i + " " + neg_testcase.get(i) + "\n");
                System.out.println(pingObj.computeMedian(neg_testcase.get(i),2));
                System.out.println("\n");

    }

    
	  }
}

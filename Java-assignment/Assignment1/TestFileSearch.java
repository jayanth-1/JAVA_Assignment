import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TestFileSearch{

  public static void main(String[] args)
  {
    String directory_name = "/home/zemoso" ;  
    List<String> neg_testcase = Arrays.asList("*hello");
    List<String> pos_testcase = Arrays.asList("hello.*", "[a-z]", "[a-zA-Z0-9]");
    
    int i;
    FileSearch obj = new FileSearch();
    System.out.println("Running Positive test case \n\n");
    for(i=0;i<pos_testcase.size();i++)
    {
      System.out.println("test case " + i + " " + pos_testcase.get(i) + "\n");
      obj.searchingFiles(directory_name,pos_testcase.get(i));
      System.out.println("\n");

    }
    
    for(i=0;i<neg_testcase.size();i++)
    {
      System.out.println("test case " + i + " " + neg_testcase.get(i) + "\n");
      obj.searchingFiles(directory_name,neg_testcase.get(i));
    }

  }
}

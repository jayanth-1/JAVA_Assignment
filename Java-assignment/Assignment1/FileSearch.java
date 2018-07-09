import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSearch{

	/* Takes two inputs prints absolute path of file
	 * @param  1st input directoryName as string
	 * @param  2nd input regular expression as string
	 * function recursively finds pattern in file names  and prints absolute path
	 */

public void searchingFiles(String directoryName,String pattern){
  try{
        File directory = new File(directoryName);      // creating file class
        //get all the files from a directory
        File[] fList = directory.listFiles();
        
        for (File file : fList){
            if (file.isFile()){ 
              Pattern  expression = Pattern.compile(pattern);
              // Now create matcher object.
              Matcher match = expression.matcher(file.getName());   // matching file name with pattern
              if(match.matches()){                         // if matches
                                      
               System.out.println(file.getAbsolutePath()); // printing absolute path
             }
             }
             else if (file.isDirectory()){
                searchingFiles(file.getAbsolutePath(),pattern); // recursivley searching files directories & subdirectories
            }
        }
        

     } 

   catch(Exception e)
   {
      System.out.println("Check Regular expression it is not valid \n");
   }
}


 public static void main(String[] args)
 {

    String directory_name = "/home/zemoso" ;                // home directory
    FileSearch obj = new FileSearch();                     // creating object of First class  
    while(true) {
      System.out.println("Enter regular expression \n ");    //Taking input from terminal i.e regular expression
      Scanner sc = new Scanner(System.in);  
      String pattern = sc.next();
      obj.searchingFiles(directory_name,pattern);
}


}

}



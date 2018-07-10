import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileSearch{

	/* Takes two inputs prints absolute path of file and returns boolean value
	 * @param  1st input directoryName as string
	 * @param  2nd input regular expression as string
	 * function recursively finds pattern in file names,prints absolute path and returns true if it contains any single file of that pattern else false   
	 */

public boolean searchingFiles(String directoryName,String pattern,boolean flag){
  try{
        File directory = new File(directoryName);      // creating file class
        //get all the files from a directory
        File[] fList = directory.listFiles();
        
        for (File file : fList){
            if (file.isFile()){ 
              Pattern  expression = Pattern.compile(pattern);
              // Now create matcher object.
              Matcher match = expression.matcher(file.getName());   // matching file name with pattern
               if(match.matches()){          // if matches
                 flag = true;
                 System.out.println(file.getAbsolutePath()); // printing absolute path
                 
               }
             }
             else if (file.isDirectory()){
                flag=searchingFiles(file.getAbsolutePath(),pattern,flag);  // recursivley searching files directories & subdirectories
                 
             }
         }
         
        return flag ; 
        
      } 

   catch(Exception e)
    {
       System.out.println("Check Regular expression it is not valid \n");
       return flag;
    }

}


 public static void main(String[] args)
 {

    String directory_name = "/home/zemoso" ;                // home directory
    FileSearch obj = new FileSearch();                   // creating object of First class
     
    boolean flag = false;
    while(true) {
      System.out.println("Enter regular expression \n ");    //Taking input from terminal i.e regular expression
      Scanner sc = new Scanner(System.in);  
      String pattern = sc.next();
      obj.searchingFiles(directory_name,pattern,flag);
    }


  }

 }



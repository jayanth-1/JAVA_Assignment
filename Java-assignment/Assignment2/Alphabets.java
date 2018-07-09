import java.util.*;
import java.lang.*;
import java.io.*;

class Alphabets{
    

    /* Takes one input and returns string
     * @param string as input
     * method finds whether string contains all alphabets(a-z) present or not

     */   
	public  String checkingAlphabets(String s){

		int count = 0;
		String str = s.toLowerCase();
		String answer1 = "String contains all alphabets a-z(case insensitive) \n" ;
		String answer2 = "String doesn't contains 26 alphabets" ;
                boolean[] hashString = new boolean[26];
		int i = 0;
                if(s.length()>0)
                {
		   for(i=0; i<str.length();i++)
		    {
		       if((str.charAt(i)-'a')>=0 && (str.charAt(i)-'a')<=26)
			  hashString[str.charAt(i)-'a'] = true;
		}  

		   for(i=0; i<str.length();i++)
		    {
                      if((str.charAt(i)-'a')>=0 && (str.charAt(i)-'a')<=26)
                        {
		           if(hashString[str.charAt(i)-'a'])
		             count++;
		           hashString[i] = false;
            }
		}

                  if(count==26)                               // Checking if a-z alphabets present or not
                  {
                     return answer1; 
        }

        }                                          

                  return answer2;
	}

	public static void main(String[] args)
         {
            while(true)
            {
               System.out.println("Enter string \n");
               Scanner sc = new Scanner(System.in);                   
               String s = sc.next();                                  // Taking input string from console
               Alphabets alphabet = new Alphabets();
               System.out.println(alphabet.checkingAlphabets(s));
         }
}
}

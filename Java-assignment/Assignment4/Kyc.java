import java.util.*;
import java.text.*;
import java.lang.*;
class Kyc
{

	/* Takes two inputs and returns string
	 * @param 1st input is signup date as string
	 * @param 2nd input is current date as string
	 * method calculates range of date to fill Kyc form
	 */

	public static String rangeCalculation(String signup, String current) throws Exception
	{ 
		
	  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	  Date date1=null;Date date2=null;
	  Date anni=null;Date original=null;
	  Date plus=null;Date minus=null;

	  
	  date1=dateFormat.parse(signup);      //converting string into Date object
	  date2=dateFormat.parse(current);
	  
	  Calendar calendar = Calendar.getInstance();  //calculating the year of current date
	  calendar.setTime(date2);
	  int curr_year=calendar.get(Calendar.YEAR);
	  
	  Calendar calendar2 = Calendar.getInstance(); // Instance for sign up date
	  calendar2.setTime(date1);
	  int sign_year=calendar2.get(Calendar.YEAR);
	  
	  int diff=curr_year-sign_year;
	  
	  Calendar calendar1 = Calendar.getInstance();
	  calendar1.setTime(date1);
	  calendar1.add(Calendar.YEAR,diff);
	  original=calendar1.getTime();
	 
	  calendar1.add(Calendar.YEAR,-1);
	  minus=calendar1.getTime();
	 
	  calendar1.add(Calendar.YEAR,2);
	  plus=calendar1.getTime();
	  
	  long ori=Math.abs(date2.getTime()-original.getTime());  //closest anniversary date
	  
	  long min=Math.abs(date2.getTime()-minus.getTime());
	  
	  long plu=Math.abs(date2.getTime()-plus.getTime());
	  
	  long smallest = Math.min(ori, Math.min(min, plu));
      if(smallest==ori)
      	 anni=original;
      else if(smallest==min)
         anni=minus;
      else
         anni=plus;
      
       Date first=null;   //calculating range
       Date second=null;
       Calendar calendar3 = Calendar.getInstance();
       calendar3.setTime(anni);
          
       calendar3.add(Calendar.DATE,-30);  // before 30 days of anniversary
       first=calendar3.getTime();
          
       calendar3.add(Calendar.DATE,60);   // after 30 days
       second=calendar3.getTime();
       String answer1;String answer2;
       String answer3 = "No range";
	   if(!first.before(date2)&&!second.before(date2))
	   	   return answer3;
	 
	    else if(!second.before(date2))
	      {  
	     	String str=dateFormat.format(first);
            String str1=dateFormat.format(date2);
            answer1 = str+ " " + str1;
            return answer1;
	      }
	      else{
	   	  	  String str2=dateFormat.format(first);
	   	      String str3=dateFormat.format(second);
	    	  answer2 = str2+ " " + str3;
	      }
    
           return answer2;
    }
    
}


       public static void main(String[] args) throws Exception {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter number of test cases : \n");
          int n=sc.nextInt();
          int i;
          for(i=0;i<n;i++)
    	  { 
    	    System.out.println("Enter the signup date and current date");
    	    String signup=sc.next();
    	    String current=sc.next();
    	    System.out.println(Kyc.rangeCalculation(signup,current));
    	  }
       }
}

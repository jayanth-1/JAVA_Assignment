import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class PingMedianTime{


                      private static final Pattern PATTERN = Pattern.compile(
                             "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    
                      /* Takes one input returns boolean value
                       * @param input as a string
                       * method returns true if ip matches else false
                       */
                      public static boolean validateString(final String ip) {
                          return PATTERN.matcher(ip).matches();
                      }

                      /* Takes one input
                       * @param input as a string
                       * method compute median for odd number of pings
                       */
                      public static double oddPingTime(String odd)
                      {
                        Double f = Double.parseDouble(odd);
                        return f;
    
                      }

                       /* Takes one input
                        * @param input as a string
                        * method compute median for even number of pings
                        */
                       
                      public static double evenPingTime(String mid,String next_mid)
                      {
                         Double f1 = Double.parseDouble(mid);
                         Double f2 = Double.parseDouble(next_mid);
                         Double f3 = (f1 + f2 )/2 ;
                         return f3;
                      }

                      /* Takes two inputs and returns median of ping time
                       * @param 1st input is a string contains ip address
                       * @param 2nd input is int for number of pings
                       * method computes median of ping taken for a particular address
                       */

                      public double computeMedianTime(String ip,int n)
                      {   
                         String pingResult = "";
    
                         String pingCmd = "ping " + ip + " -c" +" " + n; double ans=0.0; 

                         try{
                               Runtime run = Runtime.getRuntime();
                               Process processPing = run.exec(pingCmd);
                               BufferedReader in = new BufferedReader(new InputStreamReader(processPing.getInputStream()));
                               String inputLine; 

                               while ((inputLine = in.readLine()) != null) {
                                  System.out.println(inputLine);
                                  pingResult += inputLine;
                               }
                               in.close();

                               List<String> time = new ArrayList<String>();
                               int i = 0;
                               for(i=0;i<n;i++)
                               {
                                  pingResult = pingResult.substring(pingResult.indexOf("time="));
                                  time.add(pingResult.substring(5,10));
                                  pingResult = pingResult.substring(10); 
                               }

                               int d = time.size()/2;
                               int re = time.size()%2;
                               if(re == 1){
                                  ans = PingMedianTime.oddPingTime(time.get(d));
                              }

                               else{
                                  ans   = PingMedianTime.evenPingTime(time.get(d-1),time.get(d));
    
                                  }
                                  }

                          catch(Exception e)
                          {
                             System.out.println(e);
                          }

                                return ans ;
                        }


	             public static void main(String[] args)
	                {
                           String ip;int n;
                           PingMedianTime pingObj = new PingMedianTime();
                           while(true)
                           {
                             System.out.println("Enter host address : \n");
                             Scanner sc = new Scanner(System.in);
                             ip = sc.next(); 
                             boolean check = validateString(ip);
                             if(check)
                             {
                               System.out.println("Enter how many times to ping : \n");
                               n = sc.nextInt();
                               System.out.println( "Median of time taken to ping "+ pingObj.computeMedianTime(ip,n));
                             }
                             else{
                                 System.out.println("Please enter valid ip  \n");
                             }
                           }

                  }
}


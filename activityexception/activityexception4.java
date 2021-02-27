package day4inner;
import java.util.*;
class Invalidd extends Exception
{  
/**
	 * 
	 */
private static final long serialVersionUID = 1L;

Invalidd()
     {
    	 System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
    	 
     }
}


public class activityexception4 {

	public static void main(String[] args) throws Invalidd{

		 try (Scanner s = new Scanner(System.in)) {
			String[] st = {"Chennai Super Kings","Rajasthan Royals" ,"Royal Challengers Bangalore"," Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians"};
			 System.out.println("Enter the expected winner team of IPL Season 13");
			 String str=s.nextLine();
			  for(String i:st)
				      {
				         if(i.equals(str))
				            {
				        	 
				        	 System.out.println("Enter the expected runner team of IPL Season 13");
				    		 String str1=s.nextLine();
				    	  	  for (String ii:st)
						      {
						         if(ii.equals(str1))
						            {
						        	 System.out.println(" expected winner team of IPL Season 13:Rajasthan Royals");
						        	 System.out.println(" expected Runner team of IPL Season 13:Kings XI Punjab");
						            }
						         else
						        	 throw new Invalidd();
						       }
				            }
				         else
				        	 throw new Invalidd();
				      }

		}
		
	}
		

	}



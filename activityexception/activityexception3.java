package day4inner;
import java.util.*;
class Invalid extends Exception
{
	Invalid()
	{
	System.out.println("Customexception:InvalidAgeRangeException");	
	}
}

public class activityexception3 {
	
	public static void main(String[] args) throws Invalid{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the player name");
	String str=s.nextLine();
	System.out.println("Enter the player age");
	int a=s.nextInt();	
	if(a<19)
		throw new Invalid();
	else {
		
		System.out.println("player name:"+str);
		System.out.println("player age:"+a);
	}}

}

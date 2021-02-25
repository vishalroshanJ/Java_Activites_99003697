package activitys;

import java.util.*;
public class activitysecond {
	public static int check_Leap_Year()
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the year to check for leap year: ");
		long year=inp.nextLong();
		int res = 0;
		if(year%4==0 && year>=0)
		{
			res=1;
		}
		else if(year%4!=0 && year>=0)
		{
			res=0;
		}
		else
		{
			res=-1;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=check_Leap_Year();
		if(y==1)
		{
			System.out.println("yes");
		}
		else if(y==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("invalid input");
		}
		
	}

}

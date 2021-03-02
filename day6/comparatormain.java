package democollection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class comparatormain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList<playercomparator> ar= new ArrayList<playercomparator>();
	   System.out.println("Please provide the number of players to be registered");
	   int num=s.nextInt();
        for(int i=0;i<num;i++)
        {
	   System.out.println("Please enter player name");
	   String str1=s.next();
	   System.out.println("Please select the skill of the player\r\n"+ "1.All Rounder\r\n"+ "2.Batsman\r\n"+ "3.Bowler\r\n");
	   int num1=s.nextInt();
	   String str3="";
	   if(num1==1)
		   str3="All Rounder";
	   else if(num1==2)
		   str3="Batsman";
	   else if(num1==3)
		   str3="Bowler";
        ar.add(new playercomparator(str1,str3));
        }
	   Collections.sort(ar,new comparatorplayer());
        for(playercomparator e:ar)
        	System.out.println(e);
	}

}

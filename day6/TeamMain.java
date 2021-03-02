package democollection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Team> ar= new ArrayList<Team>();
	    System.out.println("Enter number of teams:");
	    
	   int num=s.nextInt();
        for(int i=0;i<num;i++)
        {
	   System.out.println("Enter team "+ (i+1) +"detail");
	   String str1=s.next();
	   System.out.println("Enter number of matches");
	   int num1=s.nextInt();
        ar.add(new Team (str1,num1));
        }
	   Collections.sort(ar,new TeamComparator());
        for(Team e:ar)
        	System.out.println(e);
	}

	}


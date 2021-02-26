package interfaceacttivity;
import java.util.*;
public class MatchMain {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the match format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int n=ss.nextInt();
		if(n==1)
		{
		ODIMatch om=new ODIMatch();
		System.out.println("Enter the current score");
		om.setCurrentscore(ss.nextInt());
	    System.out.println("Enter the current Over");
	    om.setCurrentover(ss.nextFloat());
		System.out.println("Enter the Target score");
		om.setTarget(ss.nextInt());	
		
		om.calculateballs();
		om.calculaterunRate();
		}
		else if(n==2)
		{
			T20Match om=new T20Match();
			System.out.println("Enter the current score");
			om.setCurrentscore(ss.nextInt());
		    System.out.println("Enter the current Over");
		    om.setCurrentover(ss.nextFloat());
			System.out.println("Enter the Target score");
			om.setTarget(ss.nextInt());		
			om.calculateballs();
			om.calculaterunRate();
		}
		
		else if(n==3)
		{
			TestMatch om=new TestMatch();
			System.out.println("Enter the current score");
			om.setCurrentscore(ss.nextInt());
		    System.out.println("Enter the current Over");
		    om.setCurrentover(ss.nextFloat());
			System.out.println("Enter the Target score");
			om.setTarget(ss.nextInt());
			om.calculateballs();
			om.calculaterunRate();
			
		}
		else
		System.out.println("Invalid format");		
	}

}

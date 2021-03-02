package democollection1;

import java.util.Scanner;

public class Mainthread {

	public static void main(String[] args) {
         Scanner s= new Scanner(System.in);
        System.out.println("Enter the Match ");
        String str=s.next();
        System.out.println("Enter the Scores");
        String str1=s.next();
        Thread t3=new SortScoreclass(str,str1);
        t3.start();

		
		
		
	}

}

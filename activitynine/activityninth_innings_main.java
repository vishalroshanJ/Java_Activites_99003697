package activitys;

import java.util.*;

public class activityninth_innings_main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		activityninth_innings emp=new activityninth_innings();
		System.out.println("Enter name:");
		String a=s.nextLine();
		System.out.println("Enter session:");
		String b=s.nextLine();
		System.out.println("Enter runs:");
		int c=s.nextInt();
		emp.getname(a);
		emp.getaddresss(b);
		emp.getmobile(c); 
		emp.display();
		

	}

}

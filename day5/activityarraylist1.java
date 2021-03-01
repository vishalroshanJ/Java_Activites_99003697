package democollection1;

import java.util.*;

public class activityarraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();//genesis
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		String str= s.nextLine();
		arr.add(str);
		System.out.println("Enter age");
		String str2= s.nextLine();
		arr.add(str2);
		System.out.println("Enter Country");
		String str1= s.nextLine();
		arr.add(str1);
		System.out.println("player details");
		for(String h:arr)
			System.out.println(h);
		System.out.println("Enter Skill");
		String str4= s.nextLine();
		arr.add(str4);
		System.out.println("Enter the position of the detail to be removed");
		int n = s.nextInt();
		arr.remove(n);
		System.out.println("player details");
		for(String h:arr)
			System.out.println(h);
	}

}

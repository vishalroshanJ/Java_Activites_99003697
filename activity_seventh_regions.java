package activitys;
import java.util.*;

public class activity_seventh_regions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1= s.nextLine(); 
		String str2= s.nextLine();
		String[] s7=str1.split("\\s");
		String[] s8=str2.split("\\s");
		String second= s7[s7.length - 1];
		String tird= s8[s8.length - 1];
		System.out.println(second);
		System.out.println(tird);
		
		System.out.println(second.equals(tird));
	
		if(second.equals(tird))
			System.out.println("YES");
		else
			System.out.println("no");
		
		

	}

}

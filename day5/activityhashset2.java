package democollection1;

import java.util.*;

public class activityhashset2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TreeSet<String> c=new TreeSet<String>();
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{   String nn = s.nextLine();
			c.add(nn);
		}
		
		for(String sr:c)
		System.out.println(sr);
	}}



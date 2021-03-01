import java.util.HashSet;
import java.util.Scanner;

public class DemoCollection3 {

	public static void main(String[] args) {
		
        HashSet<String> h= new HashSet<String>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of players");
		int t=sc.nextInt();
		System.out.println("Enter the name of players");
		for(int i=0;i<6;i++)
		{
			h.add(sc.next());
		}
		
		System.out.println(h.size());

	}

}

package activitys;
import java.util.Scanner;

public class findcount {

	
	    public static void main(String[] args) 
	    {
	        int n, x, count = 0, i = 0;
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	        int a[] = new int[n];
	        for(i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        x = s.nextInt();
	        for(i = 0; i < n; i++)
	        {
	            if(a[i] == x)
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}


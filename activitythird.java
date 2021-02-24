package activitys;
import java.util.Scanner;

public class activitythird {

	static void digitfactorial(int a)
	{int fact1=0,i=0;
		while(i <= a)
        {
            fact1 *= i;
             i++;
        }
		
	}
	
	
	
	
	public static void main(String[] args)
	{
    Scanner scanner = new Scanner(System.in);  
    int num1 = scanner.nextInt();
    if(num1>32767)
    	 System.out.println("Number is too large");
    else if(num1<0)
    	 System.out.println("number is too small");
    else 
    { 
    	  digitfactorial(num1);
    }
	}

}

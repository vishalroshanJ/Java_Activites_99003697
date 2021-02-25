package activitys;
import java.util.*;
public class avtivityeighth_empmain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		activityeight_employee emp=new activityeight_employee();
		System.out.println("Enter the name:");
		String a=s.nextLine();
		System.out.println("Enter the address:");
		String b=s.nextLine();
		System.out.println("Enter the mobile:");
		String c=s.nextLine();
		emp.getname(a);
		emp.getaddresss(b);
		emp.getmobile(c); 
		emp.display();
		
	}

}

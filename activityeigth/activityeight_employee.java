package activitys;
import java.util.*;

public class activityeight_employee {
	private String name;
	private String address;
	private String mobile;
	
	public void getname(String a)
	{   
		this.name=a;
	}
	public void getaddresss(String b)
	{   
		address=b;
	}
	public void getmobile(String c)
	{   
		mobile=c;
		
	}
	public void display ()
	{   System.out.println("Employee Details");
		System.out.println("Name:"+name);
		System.out.println("address:"+address);
		System.out.println("mobile :"+mobile);
	}
}

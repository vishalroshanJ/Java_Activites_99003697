package activitys;

public class activityninth_innings {
	 String teamname;
     String inningsname;
	 int runs;
	
	public void getname(String a)
	{   
		this.teamname=a;
	}
	public void getaddresss(String b)
	{   
		inningsname=b;
	}
	public void getmobile(int c)
	{   
		runs=c;
		
	}
	public void display ()
	{  
		System.out.println("TeamName:"+teamname);
		System.out.println("session:"+inningsname);
		System.out.println("Runs :"+runs);
	}

}

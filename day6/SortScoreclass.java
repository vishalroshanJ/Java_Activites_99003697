package democollection1;

public class SortScoreclass extends Thread{
	String matchType;
	String scoreString;
	int scores ;
	
	
    public SortScoreclass(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
    
    String[] arr=scoreString.split("\\,"); 
	public void run()
    {
    	System.out.println(arr);
    	
   
    }
	

}

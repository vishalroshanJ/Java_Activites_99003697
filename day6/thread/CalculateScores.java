package democollection1;

import java.util.Arrays;

public class CalculateScores extends Thread{

	String matchType;
	String scoreString;
	int[]  scores;
	double meanScore=0;
	double minScore;
    double maxScore;
	public CalculateScores(String matchType, String scoreString) {
		super();
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public double getMeanScore() {
		return meanScore;
	}
	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}
	public double getMinScore() {
		return minScore;
	}
	public void setMinScore(double minScore) {
		this.minScore = minScore;
	}
	public double getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(double maxScore) {
		this.maxScore = maxScore;
	}
	
	 @Override
		public void run() {
	    	super.run();
	    	String[] arr=scoreString.split("\\,"); 
	    	scores = new int[arr.length];
	    	for (int i=0;i<arr.length;i++)
	    		scores[i]=Integer.parseInt(arr[i]);
	    	maxScore=scores[0];
	    	minScore=scores[0];
	    	for (int i=0;i<scores.length;i++) {
	    		meanScore= meanScore + scores[i];
	    	   if(scores[i] > maxScore)
	    		   maxScore = scores[i];
	    	   if(scores[i] < minScore)
	    		   minScore = scores[i];
	    	}
		     System.out.println("Match  :"+matchType);
		     System.out.println("meanScore  :"+meanScore);
		     System.out.println("maxScore  :"+maxScore);
		     System.out.println("minScore  :"+minScore);
		     
			}
	    	
	    	
		}
	
    
    


package day4inner;
import java.io.*;
public class activityexception2 {
	
	

		public static void main(String[] args) {
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			
			try{
				System.out.println("Enter the number of overs");
				int n=Integer.parseInt(br.readLine());
				System.out.println("Enter the number of runs for each over");
				int arr[] = new int[n];
				for(int i=0;i<arr.length;i++) {
					arr[i]=Integer.parseInt(br.readLine());
				}
				System.out.println("Enter the over number");
				int n1=Integer.parseInt(br.readLine());
				System.out.println("Runs scored in this over" + arr[n1]);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}

	}



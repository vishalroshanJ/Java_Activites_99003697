package day4;

import java.util.*;


public class vehiclemain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		vehicle v= new vehicle();
		System.out.println("1.Four Wheeler\n 2.Two Wheeler");
	    System.out.println("Enter Vehicle Type:");
	    int n = sc.nextInt();
	    if(n==1)
	    {
	    System.out.println("Enter Vehicle Make:");
	    String str = sc.next();
	    System.out.println("Enter Vehicle Number:");
	    String str1 = sc.next();
	    System.out.println("Enter Fuel Type\n 1.Petrol\r\n2.Diesel");
	    int n1 = sc.nextInt();
	    String strr="";
	    if(n1==1)
	    	strr="Petrol";
	    else
	    	strr="disel";
	    System.out.println("Enter Fuel Capacity");
	    int n2 = sc.nextInt();
	    System.out.println("Enter Engine CC:");
	    int n3 = sc.nextInt();
	    System.out.println("Enter Audio System:");
	    String str2 = sc.next();
	    System.out.println("Enter Number of Doors:");
	    int n4 = sc.nextInt();
	    v.setMake(str);
	    v.setVehicleNumber(str1);
	    v.setFuelType(strr);
	    v.setFuelCapacity(n2);
	    v.setCc(n3);
	    FourWheeler fr=new FourWheeler(str,str1,strr,n2,n3,str2,n4);
	    fr.setAudioSystem(str2);
	    fr.setNumberOfDoors(n4);
	    fr.displayMake();
	    fr.displayBasicInfo();
	    fr.displayDetailInfo();
	    }
	    else if(n==2)
	    {
	    System.out.println("Enter Vehicle Make:");
	    String str = sc.next();
	    System.out.println("Enter Vehicle Number:");
	    String str1 = sc.next();
	    System.out.println("Enter Fuel Type\n 1.Petrol\r\n2.Diesel");
	    int n1 = sc.nextInt();
	    String strr="";
	    if(n1==1)
	    	strr="Petrol";
	    else
	    	strr="disel";
	    System.out.println("Enter Fuel Capacity");
	    int n2 = sc.nextInt();
	    System.out.println("Enter Engine CC:");
	    int n3 = sc.nextInt();
	    System.out.print("Kick Start Available(yes/no):");
	    String t=sc.next();
	    v.setMake(str);
	    v.setVehicleNumber(str1);
	    v.setFuelType(strr);
	    v.setFuelCapacity(n2);
	    v.setCc(n3);
	    TwoWheeler tw=new TwoWheeler(str,str1,strr,n2,n3,t);
	    tw.setKickStartAvailable(t);
	    tw.displayMake();
	    tw.displayBasicInfo();
	    tw.displayDetailInfo();
	    } 
	    else 
	    	System.out.println("invalid");
	}
}

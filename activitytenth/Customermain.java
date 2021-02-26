package activitys;

import java.util.*;

class Customermain{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details");
		String str= sc.nextLine();
		String[] arr= str.split(",");

		

		Customer c= new Customer();
		c.setName(arr[0]);
		c.setAddress(arr[1]);
		c.setMobile(arr[2]);
		c.display();
	}
}

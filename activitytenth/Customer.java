package activitys;
import java.util.*;

public class Customer {
	
		private String name;
		private String address;
		private String mobile;

		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getAddress()
		{
			return address;
		}
		public void setAddress(String address)
		{
			this.address=address;
		}
		public String getMobile()
		{
			return mobile;
		}
		public void setMobile(String mobile)
		{
			this.mobile=mobile;
		}
		public void display()
		{
			System.out.println("Name of the Employee:"+getName());
			System.out.println("Address of the Employee:"+getAddress());
			System.out.println("Mobile No. of the Employee:"+getMobile());
		}
	}

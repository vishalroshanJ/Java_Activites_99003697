package day4;

public class TwoWheeler extends vehicle {
private String	 kickStartAvailable;

public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
		String kickStartAvailable) {
	super(make, vehicleNumber, fuelType, fuelCapacity, cc);
	this.kickStartAvailable = kickStartAvailable;
}

	
public String isKickStartAvailable() {
	return kickStartAvailable;
}


public void setKickStartAvailable(String kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}


public void displayDetailInfo()
  {System.out.println("Kick Start Available:"+kickStartAvailable);
  }
}

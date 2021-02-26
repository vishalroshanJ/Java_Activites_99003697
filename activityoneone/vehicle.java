package day4;

public class vehicle {
protected String make;
protected String vehicleNumber;
protected String fuelType;
protected int fuelCapacity;
protected int cc;
public vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
	super();
	this.make = make;
	this.vehicleNumber = vehicleNumber;
	this.fuelType = fuelType;
	this.fuelCapacity = fuelCapacity;
	this.cc = cc;
}

public vehicle() {
	super();
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getVehicleNumber() {
	return vehicleNumber;
}

public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}

public String getFuelType() {
	return fuelType;
}

public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public int getFuelCapacity() {
	return fuelCapacity;
}

public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}

public int getCc() {
	return cc;
}

public void setCc(int cc) {
	this.cc = cc;
}

public void displayMake()
{System.out.println("*****"+make+"****");
}
public void displayBasicInfo()
{System.out.println("Vehicle Number"+vehicleNumber + "Fuel Capacity:"+fuelCapacity+ "Fuel Type"+fuelType+ "CC:"+cc);
}
public void displayDetailInfo()
{
}
}

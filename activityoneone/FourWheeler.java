package day4;

public class FourWheeler extends vehicle{

	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	
	
	public String getAudioSystem() {
		return audioSystem;
	}


	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}


	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public void displayDetailInfo()
	{
		System.out.println("AudioSystem:"+audioSystem+"numberOfDoors:"+numberOfDoors);
	}
	
}

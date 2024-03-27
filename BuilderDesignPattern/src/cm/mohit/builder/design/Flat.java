package cm.mohit.builder.design;

public class Flat {

	private String flatNumber;
	private double carpetArea;
	private String paintColour;
	private int noRooms;
	private boolean isCoveredParking;
	private boolean isFlatFurnished;
	
	
	
	public Flat(String flatNumber, double carpetArea, String paintColour, int noRooms, boolean isCoveredParking,
			boolean isFlatFurnished) {
		this.flatNumber = flatNumber;
		this.carpetArea = carpetArea;
		this.paintColour = paintColour;
		this.noRooms = noRooms;
		this.isCoveredParking = isCoveredParking;
		this.isFlatFurnished = isFlatFurnished;
	}
	public String getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}
	public double getCarpetArea() {
		return carpetArea;
	}
	public void setCarpetArea(double carpetArea) {
		this.carpetArea = carpetArea;
	}
	public String getPaintColour() {
		return paintColour;
	}
	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}
	public int getNoRooms() {
		return noRooms;
	}
	public void setNoRooms(int noRooms) {
		this.noRooms = noRooms;
	}
	public boolean isCoveredParking() {
		return isCoveredParking;
	}
	public void setCoveredParking(boolean isCoveredParking) {
		this.isCoveredParking = isCoveredParking;
	}
	public boolean isFlatFurnished() {
		return isFlatFurnished;
	}
	public void setFlatFurnished(boolean isFlatFurnished) {
		this.isFlatFurnished = isFlatFurnished;
	}
	
	@Override
	public String toString() {
		return "Flat [flatNumber=" + flatNumber + ", carpetArea=" + carpetArea + ", paintColour=" + paintColour
				+ ", noRooms=" + noRooms + ", isCoveredParking=" + isCoveredParking + ", isFlatFurnished="
				+ isFlatFurnished + "]";
	}
	
	
}

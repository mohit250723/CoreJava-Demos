package cm.mohit.builder.design;

public class FlatBuilder {

	private String flatNumber;
	private double carpetArea;
	private String paintColour;
	private int noRooms;
	private boolean isCoveredParking;
	private boolean isFlatFurnished;

	public FlatBuilder setFlatNumber(String flatNumber) {
		 this.flatNumber = flatNumber;
		 return this;
	}

	public FlatBuilder setCarpetArea(double carpetArea) {
		this.carpetArea = carpetArea;
		return this;
	}

	public FlatBuilder setPaintColour(String paintColour) {
		this.paintColour = paintColour;
		return this;
	}

	public FlatBuilder setNoRooms(int noRooms) {
		this.noRooms = noRooms;
		return this;
	}

	public FlatBuilder setCoveredParking(boolean isCoveredParking) {
		this.isCoveredParking = isCoveredParking;
		return this;
	}

	public FlatBuilder setFlatFurnished(boolean isFlatFurnished) {
		this.isFlatFurnished = isFlatFurnished;
		return this;
	}
	
	
	public Flat getFlat() {
		
		return new Flat(flatNumber, carpetArea, paintColour, noRooms, isCoveredParking, isFlatFurnished);
	}
	
	
}

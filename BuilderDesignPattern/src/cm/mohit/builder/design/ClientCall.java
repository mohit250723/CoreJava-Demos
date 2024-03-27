package cm.mohit.builder.design;

public class ClientCall {

	public static void main(String args[]) {
	FlatBuilder builder=new FlatBuilder();
	Flat buildFlat= builder.setNoRooms(3).setCarpetArea(12345.0).setFlatNumber("B401").setPaintColour("White").getFlat();
	System.out.print(buildFlat);
	}

}

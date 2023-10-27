package D_Principle;

//VolumeCalc is a class used to calculate the volume of a shape.
public class VolumeCalc{
	
	//initialize an IVolumeCalc instance to create dependency
	private final IVolumeCalc volumeCalc = null;
	
	//calculates and returns the volume of a 3D Shape
	public double volume () {
		return volumeCalc.volume();
	}
}

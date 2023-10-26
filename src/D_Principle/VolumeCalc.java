package D_Principle;

//VolumeCalc is a method which calculates the volume of a 3D shape
public class VolumeCalc implements IVolumeCalc{
	
	//calculates and returns the volume of a 3D Shape
	public double volume (Shape3D shape) {
		return shape.calculateVolume();
	}
}

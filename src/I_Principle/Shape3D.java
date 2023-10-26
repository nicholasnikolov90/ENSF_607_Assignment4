package I_Principle;
//Interface Segragation
//The CalculateVolume method can be called to calculate the volume of any 3D Shape

//calculateVolume is implemented by sphere in this example.

 
//Shape 3D is an interface that defines the volume calculation methods for 3D shapes
public interface Shape3D {
	
	//calculates and returns the volume for a 3D shape.
	public double calculateVolume();
}


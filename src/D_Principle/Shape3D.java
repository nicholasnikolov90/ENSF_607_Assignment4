package D_Principle;
//Interface Segragation

//The calculateArea method can be called to calculate the area of any 2D Shape
//The CalculateVolume method can be called to calculate the volume of any 3D Shape

//calculateVolume is implemented by sphere in this example.

 
//Shape 3D is an interface that defines the volume calculations for 3D shapes
public interface Shape3D {
	
	//calculates and returns the volume for a 3D shape.
	public double calculateVolume();
}


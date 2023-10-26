package I_Principle;
import java.lang.Math;

//Sphere is a 3D shape with a single radius measurement. 
//contains a constructor, getter, and calculateVolumemethods


public class Sphere implements Shape3D{
	public double radius; //radius of the sphere
	
	//constructor for a sphere, initializes the radius dimension of the sphere
	public Sphere (double radius) {
		this.radius= radius;
	}
	
	//return the radius of a sphere
	public double getRadius() {
		return radius;
	}
	
	//Calculates and returns the volume of a sphere
	@Override
	public double calculateVolume() {
		return (4/3) * Math.pow(getRadius(), 2);
	}

}

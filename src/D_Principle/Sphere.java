package D_Principle;
import java.lang.Math;
//Sphere is an object with a single radius measurement. 
//contains a constructor, getter, and volume methods
//The Sphere class implements the abstraction layer of IVolumeCalc in order to
//calculate the volume of the sphere.

public class Sphere implements IVolumeCalc{
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
	public double volume() {
		return (4/3) * Math.pow(getRadius(), 2);
	}

}

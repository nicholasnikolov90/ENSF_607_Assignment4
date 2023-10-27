package D_Principle;

/*D - Dependancy Inversion Principle
 * The main program below demonstrates the Dependancy Inversion principle
 * 
 * The volume of the sphere object is calculated through the abstraction layer of the
 * IVolumeCalc interface
 * 
 * This main method creates a sphere object, calculates the volume of the sphere
 * and prints the volume of the sphere to the terminal
 * */

public class Main {

	public static void main(String[] args) {		
		//initialize a new sphere object with radius 10 cm
		Sphere sphere = new Sphere(10);
		
		//initialize and calculate the volume of a sphere
		double sphereVolume = sphere.volume();
		
		//output the volume of the sphre
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}

}

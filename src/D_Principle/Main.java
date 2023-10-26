package D_Principle;

/*D - Dependancy Inversion Principle
 * The main program below demonstrates the Dependancy Inversion principle
 * by calculating the volume of a sphere object through an abstraction to the IVolumeCalc Interface
 * 
 * */

public class Main {

	public static void main(String[] args) {
		//implement the VolumeCalc using an abstraction to the Interface IVolumeCalc
		final IVolumeCalc volumeCalc = new VolumeCalc();
		
		//initialize a new sphere object with radius 10 cm
		Sphere sphere = new Sphere(10);
		
		//initialize and calculate the volume of a sphere
		double sphereVolume = volumeCalc.volume(sphere);
		
		//output the volume of the sphre
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}

}

package D_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final IVolumeCalc volumeCalc = new VolumeCalc();
		
		//VolumeCalc volumeCalc = new VolumeCalc();
		Sphere sphere = new Sphere(10);

		double sphereVolume = volumeCalc.volume(sphere);

		System.out.println("The volume of the sphere is: " + sphereVolume);
	}

}

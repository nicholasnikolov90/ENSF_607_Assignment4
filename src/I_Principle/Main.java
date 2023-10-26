package I_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalc areaCalc = new AreaCalc();
		VolumeCalc volumeCalc = new VolumeCalc();
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		Sphere sphere = new Sphere(10);
		
		double squareArea = areaCalc.area(square);
		double rectangleArea = areaCalc.area(rectangle);
		double sphereVolume = volumeCalc.volume(sphere);
		System.out.println("The area of the square is: " + squareArea);
		System.out.println("The area of the rectangle is: " + rectangleArea);
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}

}

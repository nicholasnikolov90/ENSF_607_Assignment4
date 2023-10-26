package I_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerimeterCalc perimeterCalc = new PerimeterCalc();
		VolumeCalc volumeCalc = new VolumeCalc();
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		Sphere sphere = new Sphere(10);
		
		double squarePerimeter = perimeterCalc.perimeter(square);
		double rectanglePerimeter = perimeterCalc.perimeter(rectangle);
		double sphereVolume = volumeCalc.volume(sphere);
		System.out.println("The perimeter of the square is: " + squarePerimeter);
		System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}

}

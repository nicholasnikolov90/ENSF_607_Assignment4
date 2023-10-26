package I_Principle;

/*The main program below is used to demonstrate the Interface Segregation Principle
 * By segregating the methods for 3D shapes and 2D shapes using their respective Interfaces. 
 * 
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isntantiate new perimeter calc object, used to calculate the perimeter for all 2D shapes
		PerimeterCalc perimeterCalc = new PerimeterCalc(); 
		
		//isntantiate new volume calc object, used to calculate the volume for all 3D shapes
		VolumeCalc volumeCalc = new VolumeCalc();
		/*Instantiate all shapes used to demonstrate the I principle
		 * */
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		Sphere sphere = new Sphere(10);
		
		
		double squarePerimeter = perimeterCalc.perimeter(square); //calculate and return the perimeter of a square
		double rectanglePerimeter = perimeterCalc.perimeter(rectangle);//calculate and return the perimeter of a rectangle
		double sphereVolume = volumeCalc.volume(sphere); //calculate and return the volume of a sphere
		
		/*Output all perimeter and volume calculations
		 * */
		System.out.println("The perimeter of the square is: " + squarePerimeter);
		System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}//closing bracket end main method

}//closing bracket end Main Class

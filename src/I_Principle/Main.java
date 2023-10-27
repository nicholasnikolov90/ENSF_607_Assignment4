package I_Principle;

/*The main program below is used to demonstrate the Interface Segregation Principle
 * By segregating the methods for 3D shapes and 2D shapes using their respective Interfaces. 
 * */

public class Main {

	public static void main(String[] args) {
		
		//Instantiate all shapes used to demonstrate the I principle
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		Sphere sphere = new Sphere(10);
		
		double squarePerimeter = square.calculatePerimeter();//calculate and return the perimeter of a square
		double rectanglePerimeter = rectangle.calculatePerimeter();//calculate and return the perimeter of a rectangle
		double sphereVolume = sphere.calculateVolume();//calculate and return the volume of a sphere
		
		//Output all perimeter and volume calculations
		System.out.println("The perimeter of the square is: " + squarePerimeter);
		System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
		System.out.println("The volume of the sphere is: " + sphereVolume);
	}//closing bracket end main method

}//closing bracket end Main Class

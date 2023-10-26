package O_L_Principle;

/*The main program below is used to demonstrate the two principles O - Open for Extension, closed for modification
 * and L - Liskov Substitution principle
 * */

public class Main {

	public static void main(String[] args) {
		//isntantiate new perimeter calc object, used to calculate the perimeter for all 2D shapes
		PerimeterCalc perimeterCalc = new PerimeterCalc();
		//Instantiate all shapes used to demonstrate the L and O principles
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		
		
		double squarePerimeter = perimeterCalc.perimeter(square); //calculate and return the perimeter of a square
		double rectanglePerimeter = perimeterCalc.perimeter(rectangle);//calculate and return the perimeter of a rectangle
		
		//Output all perimeter and volume calculations
		System.out.println("The perimeter of the square is: " + squarePerimeter);
		System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
	}

}

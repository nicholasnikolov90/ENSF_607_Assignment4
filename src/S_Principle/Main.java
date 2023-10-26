package S_Principle;

/*The main program below is used to demonstrate the Single Responsibility Principle
 * The PerimeterCalc Method is used solely for calculating the perimeter of a Square.
 * */

public class Main {

	public static void main(String[] args) {
		//isntantiate new perimeter calc object, used to calculate the perimeter for a square
		PerimeterCalc perimeterCalc = new PerimeterCalc();
		//Instantiate a new Square object used to demonstrate the S principle
		Square square = new Square(5);
		
		double squarePerimeter = perimeterCalc.perimeter(square); //calculate and return the perimeter of a square
		
		//Output all perimeter and volume calculations
		System.out.println("The perimeter of the square is: " + squarePerimeter);

	}

}

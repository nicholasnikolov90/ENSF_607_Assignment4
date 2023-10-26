package O_L_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerimeterCalc perimeterCalc = new PerimeterCalc();
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		
		double squarePerimeter = perimeterCalc.perimeter(square);
		double rectanglePerimeter = perimeterCalc.perimeter(rectangle);
		System.out.println("The perimeter of the square is: " + squarePerimeter);
		System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
	}

}

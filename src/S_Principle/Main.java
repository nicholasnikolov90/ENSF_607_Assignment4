package S_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PerimeterCalc perimeterCalc = new PerimeterCalc();
		Square square = new Square(5);
		
		double squarePerimeter = perimeterCalc.perimeter(square);
		System.out.println("The perimeter of the square is: " + squarePerimeter);

	}

}

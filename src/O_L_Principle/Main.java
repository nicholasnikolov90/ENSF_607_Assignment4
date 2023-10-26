package O_L_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalc areaCalc = new AreaCalc();
		Square square = new Square(5);
		Rectangle rectangle = new Rectangle(5, 10);
		
		double squareArea = areaCalc.area(square);
		double rectangleArea = areaCalc.area(rectangle);
		System.out.println("The area of the square is: " + squareArea);
		System.out.println("The area of the rectangle is: " + rectangleArea);
	}

}

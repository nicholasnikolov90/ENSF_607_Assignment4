package S_Principle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalc areaCalc = new AreaCalc();
		Square square = new Square(5);
		
		double squareArea = areaCalc.area(square);
		System.out.println("The area of the square is: " + squareArea);

	}

}

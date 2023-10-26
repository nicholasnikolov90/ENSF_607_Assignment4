package I_Principle;

// Square is a 2DShape with all four equal sides
//contains a constructor, getter, and calculatePerimeter methods
public class Square implements Shape2D{
	public double side; //side length of the square
	
	//constructor to set the length of the sdie of a square
	public Square (double side) {
		this.side = side;
	}
	
	//Return the length of one side of the square
	public double getSide() {
		return side;
	}
	
	//calculates and returns the perimeter of a square
	@Override
	public double calculatePerimeter() {
		return getSide() * 4.0;
	}

}

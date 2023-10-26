package I_Principle;

//Rectangle is a 2D shape that has two different side lengths. 
//contains a constructor, getter, and calculatePerimeter methods

public class Rectangle implements Shape2D{
	public double sideA; //short side of rectangle
	public double sideB; //long side of rectangle
	
	//constructor for a rectangle, sets the length of the short and long sides.
	public Rectangle (double sideA, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	//return the short side of the rectangle.
	public double getSideA() {
		return sideA;
	}
	
	//return the long side of the rectangle
	public double getSideB() {
		return sideB;
	}
	
	//Calculates and returns the perimeter of a rectangle
	@Override
	public double calculatePerimeter() {
		return getSideA() * 2.0 + 2.0 * getSideB();
	}

}

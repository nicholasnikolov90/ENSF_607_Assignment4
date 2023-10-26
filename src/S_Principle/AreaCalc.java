package S_Principle;

//Area calc is a class which accepts a square object, and calculates the area of the object.
public class AreaCalc {
	
	//calculates and returns the area of a square
	double area (Square square) {
		return square.getSide() * square.getSide();
	}
	
	/*EXPLANATION
	 * S - Single responsibility principle
	 * Each class only has one single purpose to be modified. The single purpose of this AreaCalc class is to calculate and return the area of a square.
	 * */
}

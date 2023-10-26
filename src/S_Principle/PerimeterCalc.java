package S_Principle;

//Perimeter calc is a class which accepts a square object, and calculates the area of the object.
public class PerimeterCalc {
	
	//calculates and returns the perimter of a square
	double perimeter (Square square) {
		return square.getSide() * 4.0;
	}
	
	/*EXPLANATION
	 * S - Single responsibility principle
	 * Each class only has one single purpose to be modified. The single purpose of this AreaCalc class is to calculate and return the area of a square.
	 * */
}

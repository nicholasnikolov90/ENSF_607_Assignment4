package S_Principle;

//Perimeter calc is a class which accepts a square object, and calculates the area of the object.
public class PerimeterCalc {
	
	//calculates and returns the perimter of a square
	double perimeter (Square square) {
		return square.getSide() * 4.0;
	}
}

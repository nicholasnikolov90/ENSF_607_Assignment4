package I_Principle;
//The calculatePerimeter method can be called to calculate the area of any shape.
//calculatePerimeter is implemented by rectangle and square in this example
 
//Shape 2D is an interface that defines each 2D shape needs a calculatePerimeter method
public interface Shape2D {
	
	//calculates and returns the perimeter for a 2D shape.
	public double calculatePerimeter();
}


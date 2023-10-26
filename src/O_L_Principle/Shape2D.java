package O_L_Principle;
//Open for extension, but closed for modification
//The calculatePerimeter method can be called to calculate the perimeter of any shape.
//calculatePerimeter is implemented by rectangle and square in this example
 
//Shape 2D is an interface that defines each 2D shape needs an areaCalculation method
public interface Shape2D {
	
	//calculates and returns the perimeter for a 2D shape.
	public double calculatePerimeter();
}


package O_L_Principle;
//Open for extension, but closed for modification
//The calculatePerimeter method can be called to calculate the perimeter of any shape.
//calculatePerimeter is implemented by rectangle and square in this example
 
//Shape 2D is an abstract class that defines each 2D shape needs a calculatePerimeter method
public abstract class Shape2D {
	
	//calculates and returns the perimeter for a 2D shape.
	abstract double calculatePerimeter();
}


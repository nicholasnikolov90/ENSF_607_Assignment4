package O_L_Principle;
//Open for extension, but closed for modification
//The calculateArea method can be called to calculate the area of any shape.
//calculateArea is implemented by rectangle and square in this example
 
//Shape 2D is an interface that defines each 2D shape needs an areaCalculation method
public interface Shape2D {
	
	//calculates and returns the area for a 2D shape.
	public double calculateArea();
}


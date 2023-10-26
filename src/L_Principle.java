/*Liskov Substitution - child classes should be replaceable without breaking 
 * the behaviour of the code
 * 
 * 
 * Here the child classes Square and Rectangle extend the parent class Shape
 * 
 * 
 * Square and Rectangle both inherit the calculateArea and calculate Perimeter methods
 *  and support implementation of both of their methods
 *  
 * */


public class Shape {
	
	public double calculateArea() {
		
	}
	
	public double calculatePerimeter() {
		
	}
	
	
}

public class Square extends Shape {
	@Override
	public double calculateArea() {
		return x * x;
		
	}
}

public class Rectangle extends Shape {
	@Override
	public double calculateArea() {
		return x * y;
		
	}
}

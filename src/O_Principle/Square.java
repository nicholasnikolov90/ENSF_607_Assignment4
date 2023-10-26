package O_Principle;

public class Square implements Shape2D{
	public double side;
	
	public Square (double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	@Override
	public double calculateArea() {
		return getSide() * getSide();
	}

}

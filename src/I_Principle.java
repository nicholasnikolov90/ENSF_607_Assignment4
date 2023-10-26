/*Interface Segregation Principle (I)
 * Interface should only have methods that are applied to all child classes
 * 
 * The float and vehicle interfaces are separates so we can distinguish between different
 * types of vehicles. Cars do not float, therefore they don't have a speed in knots. They don't have access to the
 * Float interface. Boats will float so they have a speed in Knots.
 * 
 * 
*/


public interface Float {
	void speedKnots();
	
}


public interface Vehicle {
	void VIN();
	
}


public class Boat implements Vehicle, Float {
	@Override 
	public void VIN() {
		
	}
	
	@Override
	public void speedKnots() {
		
	}
	
	
}

public class Car implements Vehicle {
	@Override
	public void VIN() {
		
	}
}
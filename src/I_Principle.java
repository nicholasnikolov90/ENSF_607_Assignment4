


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
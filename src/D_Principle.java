//Dependency inversion principle
//high level modules should not depend on low level modules

/* 
 * class should depend on interface
 * decouple classes from eachother
 * 
*/


interface Triathalon {
	void registration();
	void startTime();
	
}

class Race implements Triathalon {
	String raceName;
	int raceNumber;
	
	@Override
	public void registration() {
		//implement registration for the Mont- Tremplant triathalon race
		
		
	}
	
}


class Athlete {
	
	private final Triathalon triathalon;
	
	public Athlete () {
		this.triathalon = triathalon;
	}
	
	public 
}


public class Main {
    public static void main(String[] args) {

    	Triathalon triathalon = new Triathalon();
        Athlete athlete = new Athlete(triathalon);
        worker.doWork();
    }
}
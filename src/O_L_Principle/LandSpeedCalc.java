package O_L_Principle;

//LandSpeedCalc returns the ground speed of a runner.

public class LandSpeedCalc {
	
	//calculates and returns the ground speed of a runner
	double landSpeed (Runner runner) {
		return runner.getMiles() / runner.getTime();
	}
}


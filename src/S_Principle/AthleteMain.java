package S_Principle;

public class AthleteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LandSpeedCalc landSpeedCalc = new LandSpeedCalc();
		Runner runner = new Runner(10, 1);
		
		
		double runnerSpeed = landSpeedCalc.landSpeed(runner);
		System.out.println("The speed of the runner is: " + runnerSpeed);

	}

}

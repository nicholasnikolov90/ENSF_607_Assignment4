package S_Principle;

public class Runner{
	public double time; // total time the runner was running for (minutes)
	public double miles;
	
	
	public Runner (double time, double miles) {
		this.miles = miles;
	}
	
	//returns the total number of miles the runner has ran.
	public double getMiles() {
		return miles;
	}
	
	//returns the Total time the runner was running for
	public double getTime() {
		return time;
	}
	

}

package S_Principle;
import java.lang.String;
import java.util.ArrayList;  
import java.util.List;  

//Registration is a class with the only purpose of registering an athlete in the triathalon.
public class Registration {
	public List<String> athletes = new ArrayList<String>();
	
	//Adds the current athlete to the registration and returns the entire list of registered athletes.
	List<String> register (Athlete athlete) {
		athletes.add(athlete.getName());
		return athletes;
	}
}

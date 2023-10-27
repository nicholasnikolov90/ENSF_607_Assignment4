package S_Principle;
import java.lang.String;
import java.util.Arrays;
import java.util.List;

/*The main program below is used to demonstrate the Single Responsibility Principle
 * The Registration method is used only for the purposes of registering an Athlete in a Triathalon.
 * */

public class AthleteMain {

	public static void main(String[] args) {
		
		//isntantiate a new Registration Object
		Registration registration = new Registration();
		
		//Instantiate a new athlete
		Athlete athlete = new Athlete("Nick");
		
		//add the athlete to the Triathalon registration
		List<String> athletes = registration.register(athlete);
		
		
		//Output all the current athletes
		System.out.println("The list of all registered athletes is: " + Arrays.toString(athletes.toArray()));

	}

}

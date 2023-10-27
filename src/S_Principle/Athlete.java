package S_Principle;

import java.lang.String;

//Athlete is a class that represents a Triathalon Athlete. 
public class Athlete{
	public String name; //Name of the athlete
	
	//constructor to intialize the name of the athlete
	public Athlete (String name) {
		this.name = name;
	}
	
	//getter for the Athlete's Name
	public String getName() {
		return name;
	}
}

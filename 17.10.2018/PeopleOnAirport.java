package airport;

public class PeopleOnAirport {
	
	//--------PROPERTIES--------
	
	private String FirstName;
	private String LastName;
	
	//--------GETTERS--------
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	//--------SETTERS--------


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	//--------CONSTRUCTOR--------

	public PeopleOnAirport(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	//--------FUNCTIONS--------

	public void print() {
		System.out.println(LastName+" "+FirstName);		
	}
}

package airport;

public class Pilot extends PeopleOnAirport {

	// --------PROPERTIES--------

	private String FirstName;
	private String LastName;
	private int Seniority;
	private int License;

	// --------GETTERS--------

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getSeniority() {
		return Seniority;
	}

	public int getLicense() {
		return License;
	}

	// --------SETTERS--------

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setSeniority(int seniority) {
		Seniority = seniority;
	}

	public void setLicense(int license) {
		License = license;
	}

	// --------CONSTRUCTOR--------

	public Pilot(String firstName, String lastName, int seniority, int license) {
		super(firstName, lastName);
		Seniority = seniority;
		License = license;
	}

	// --------FUNCTIONS--------
	
	@Override
		public void print() {
			super.print();
			System.out.println("is a "+this.getClass().toString().substring(14)+"\nwith seniority of "+Seniority+" years,\nand his license number is:"+License);
		}



}

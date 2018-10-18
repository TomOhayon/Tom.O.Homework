package airport;

public class Passenger extends PeopleOnAirport {

	// --------PROPERTIES--------

	private String FirstName;
	private String LastName;
	private int PassportNum;

	// --------GETTERS--------

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getPassportNum() {
		return PassportNum;
	}

	// --------SETTERS--------

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setPassportNum(int passportNum) {
		PassportNum = passportNum;
	}

	// --------CONSTRUCTOR--------

	public Passenger(String firstName, String lastName, int passportNum) {
		super(firstName, lastName);
		PassportNum = passportNum;
	}

	// --------FUNCTIONS--------

	@Override
	public void print() {
		super.print();
		System.out.println("is a " + this.getClass().toString().substring(14) + "\npassport number:" + PassportNum
				+ "\nHappy Trip Abroad!!!");
	}

}

package airport;

public class FlightAttendant extends PeopleOnAirport {
	// --------PROPERTIES--------

	private String FirstName;
	private String LastName;
	private String LandOfOrigin;
	private String Department;
	private int Seniority;

	// --------GETTERS--------

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getLandOfOrigin() {
		return LandOfOrigin;
	}

	public String getDepartment() {
		return Department;
	}

	public int getSeniority() {
		return Seniority;
	}

	// --------SETTERS--------

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setLandOfOrigin(String landOfOrigin) {
		LandOfOrigin = landOfOrigin;
	}

	public void setDepartment(String Department) {
		this.Department = (Department == "buisness" || Department == "first" || Department == "economy") ? Department
				: null;
	}

	public void setSeniority(int seniority) {
		Seniority = seniority;
	}

	// --------CONSTRUCTOR--------

	public FlightAttendant(String firstName, String lastName, String landOfOrigin, String department, int seniority) {
		super(firstName, lastName);
		LandOfOrigin = landOfOrigin;
		Department = department;
		Seniority = seniority;
	}

	// --------FUNCTIONS--------

	@Override
	public void print() {
		super.print();
		System.out.println("is a " + this.getClass().toString().substring(14) + "\nwith seniority of " + Seniority
				+ " years,\nand staffed in " + Department + " department");
	}

}

package airport;

public class LandAttendant extends PeopleOnAirport {
	// --------PROPERTIES--------

		private String FirstName;
		private String LastName;
		private String LandOfOrigin;
		private String LandDuty;
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

		public String getLandDuty() {
			return LandDuty;
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

		public void setLandDuty(String landDuty) {
			LandDuty = landDuty;
		}

		public void setSeniority(int seniority) {
			Seniority = seniority;
		}

		// --------CONSTRUCTOR--------

		public LandAttendant(String firstName, String lastName, String landOfOrigin, String landDuty, int seniority) {
			super(firstName, lastName);
			LandOfOrigin = landOfOrigin;
			LandDuty = landDuty;
			Seniority = seniority;
		}

		// --------FUNCTIONS--------

		@Override
		public void print() {
			super.print();
			System.out.println("is a " + this.getClass().toString().substring(14) + "\nwith seniority of " + Seniority
					+ " years,\nand staffed in " + LandDuty + " land department");
		}

	}



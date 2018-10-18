package airport;

public class App {

	public static void main(String[] args) {
		Pilot Captain = new Pilot("Tom", "Cruise", 7, 696969);
		Captain.print();
		System.out.println("******************************");
		FlightAttendant F = new FlightAttendant("Britney", "Spears", "USA", "economy", 5);
		F.print();
		System.out.println("******************************");
		LandAttendant L = new LandAttendant("Chocolate", "Ten-La", "Israel", "duty-free", 17);
		L.print();
		System.out.println("******************************");
		Passenger P = new Passenger("Eyal", "Peled", 0000001);
		P.print();
	}

}

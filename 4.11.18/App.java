
public class App {

	public static void main(String[] args) {
		 Suitcase S = new Suitcase();
		String[] packList = { "passport", "visa", "insurance", "driving", "boarding pass", "phone", "phone charger",
				"electronic plug converter", "earphones", "music player", "wallet", "money", "keys",
				"credit and debit cards", "laptop", "camera", "small hand bag", "jewellery", "batteries", "socks" };
		Passenger P = new Passenger(Math.random()*900+100, Math.random()*90+10, Math.random()*190+10, S);
		for (int i = 0; i < Math.random()*5+5; i++) {
			S.suitcase.add(new Items(Math.random()*15+1, packList[(int)Math.random()*19]));
		}
		System.out.println(P.toString());
	}

}

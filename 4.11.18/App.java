package HOMEWORK;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice;
		int remove;
		Suitcase S = new Suitcase();
		String[] packList = { "passport", "visa", "insurance", "driving", "boarding pass", "phone", "phone charger",
				"electronic plug converter", "earphones", "music player", "wallet", "money", "keys",
				"credit and debit cards", "laptop", "camera", "small hand bag", "jewellery", "batteries", "socks" };
		Passenger P = new Passenger(Math.random() * 900 + 100, Math.random() * 90 + 10, Math.random() * 190 + 10, S);
		for (int i = 0; i < (Math.random() * 5) + 5; i++) {
			S.suitcase.add(new Items((Math.random() * 15) + 1, packList[(int) (Math.random() * 19)]));
		}
		System.out.println(P.toString());
		S.showList();
		while (S.total() > P.getAllowedWeight()) {
			System.out.println("do u like to pay for the extra weight?\nthe amount is:");
		/*	System.out.println(P.getAllowedWeight());
			System.out.println(P.getExtraCharge());
			System.out.println(S.total());*/

			System.out.println((S.total() - P.getAllowedWeight()) * P.getExtraCharge());
			System.out.println("y/n");
			choice = scan.next();
			if (choice.matches("n")) {
				System.out.println("please insert the index of the item you wish to remove:");
				remove = scan.nextInt();
				S.suitcase.remove(remove - 1);
			}
			else {
				System.out.println("new total cost:");
				P.setTicketPrice(P.getTicketPrice()+(S.total() - P.getAllowedWeight()) * P.getExtraCharge());
				System.out.println(P.getTicketPrice());
				break;
			}
			System.out.println(P.toString());
			S.showList();
		}
		scan.close();
	}
}

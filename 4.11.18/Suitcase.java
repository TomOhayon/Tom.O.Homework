package HOMEWORK;

import java.util.ArrayList;

public class Suitcase {

	// ------properties------
	double weightSum;
	String list;

	ArrayList<Items> suitcase = new ArrayList<Items>();

	// ------methodes-------
	public double total() {
		for (Items items : suitcase) {
			weightSum += items.getWeight();
		}
		return weightSum;
	}

	public void showList() {
		for (Items items : suitcase) {
			System.out.print(suitcase.indexOf(items)+1);
			System.out.print(". ");
			System.out.println(items.itemName);
			System.out.println(items.weight);
			System.out.println("********************");
		}
	}

}

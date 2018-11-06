package HOMEWORK;

public class Items {
	// ------properties------
	protected double weight;
	protected String itemName;

	// ------get+set------
	public double getWeight() {
		return weight;
	}

	public String getItemName() {
		return itemName;
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("negative weight is impossible!");
		}
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// ------cotr------
	public Items(double weight, String itemName) {
		super();
		this.weight = weight;
		this.itemName = itemName;
	}

	// ------methodes------
	@Override
	public String toString() {
		return "[" + weight + "; " + itemName + "]";
	}
}

package hw101018;

public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;

	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppings = toppings;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		this.toppings = toppings;
	}

	public boolean isBasic () {
		if (this.toppings==0)
			return true;
		else
			return false;
	}
	public void print() {
		System.out.println("this pizza is "+diameter+" cm long\nit has "+slices+" slices\nand it has "+toppings+" toppings");
	}
}

package hw101018;

import java.util.Scanner;

public class aLotOfPizza {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int toppingSum = 0;
		//i let the user choose the price per top
		//although i think that a better way to treat toppings is with 3 different 
		//types of toppings according to their price.
		int toppingPrice;
		System.out.println("please enter the price per 1 topping:");
		toppingPrice = scan.nextInt();
		System.out.println("\n*********************************\n");
		Pizza orders[] = new Pizza[5];
		for (int i = 0; i < orders.length; i++) {
			orders[i] = new Pizza((int) (Math.random() * 40 + 10), (int)(Math.random() * 7 + 1), (int)(Math.random() * 5));
		}
		//Sorry for making all the pizza randomly - i'm lazy
		for (int i = 0; i < orders.length; i++) {
			System.out.println("is this pizza has no topping?:"+orders[i].isBasic());
			orders[i].print();
			System.out.println("\n*********************************\n");
			toppingSum = toppingSum + orders[i].getToppings();
		}
		System.out.println("the sum of all the toppings on top of all the orders is: " + (toppingPrice * toppingSum));
	}

}

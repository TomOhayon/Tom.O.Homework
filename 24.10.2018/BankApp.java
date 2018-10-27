package homework241018;

public class BankApp {

	public static void main(String[] args) {
		BankAccount B = new BankAccount();
		System.out.println(B.toString());
		B.deposit(700);
		System.out.println(B.toString());
		B.withdrawal(1200);
		System.out.println(B.toString());
		B.setOverDraftAllowed(true);
		B.setOverDraftSum(1000);
		System.out.println(B.toString());
		B.deposit(300);
		System.out.println(B.toString());
		B.withdrawal(700);
		System.out.println(B.toString());
	}

}

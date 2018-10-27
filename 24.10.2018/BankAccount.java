package homework241018;

public class BankAccount {
	// -----------properties---------
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftSum;

	// ----------constructor---------
	public BankAccount() {
		super();
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	// ------setters+getters---------
	public String getAccountName() {
		return accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}

	// ----------methods-------------
	public void deposit(double balance) {
		if (balance >= 0) {
			this.balance += balance;
		} else {
			System.out.println("Invalid deposit!");
		}
	}

	public void withdrawal(double withdrawal) {
		this.balance -= this.isOverDraftAllowed ? Math.min(this.balance + this.overDraftSum, withdrawal)
				: Math.min(this.balance, withdrawal);
	}

	@Override
	public String toString() {
		return "accountName: " + accountName + " \naccountNum: " + accountNum + " \nbalance: " + balance
				+ " \nthe sum of allowed overdraft: " + overDraftSum;
	}

}

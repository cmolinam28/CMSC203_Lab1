
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public void postInterest() {
		double monthlyInterest = getBalance() + (rate / 12.0);
		deposit(monthlyInterest);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount original, double initialBalance) {
		super(original, initialBalance);
		this.rate = original.rate;
		this.savingsNumber = original.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
		
	}

}

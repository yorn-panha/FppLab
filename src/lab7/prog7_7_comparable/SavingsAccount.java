package lab7.prog7_7_comparable;

public class SavingsAccount extends Account {
	private final double MONTHLY_INTEREST_RATE = 0.25;
	SavingsAccount(Employee e, double startBalance){
		super(e,startBalance);
	}
	SavingsAccount(Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		double interest = (MONTHLY_INTEREST_RATE/100) * baseBalance;
		setBalance(baseBalance + interest);
	}
	public AccountType getAcctType(){
		return AccountType.SAVINGS;
	}

}

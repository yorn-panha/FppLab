package lab7.prog7_7_comparable;

public class CheckingAccount extends Account {
	private final double MONTHLY_SERVICE_CHARGE = 5.00;

	CheckingAccount(Employee e,  double startBalance){
		super(e,startBalance);
	}
	CheckingAccount(Employee e){
		super(e);
	}
	
	public void updateBalance() {
		double baseBalance = super.getBalance();
		setBalance(baseBalance - MONTHLY_SERVICE_CHARGE);
	}
	public AccountType getAcctType(){
		return AccountType.CHECKING;
	}

}

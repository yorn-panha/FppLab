package lab7.prog7_3_improved_employee;

public class CheckingAccount extends Account {
	public static final int CHECKING_SERVICE_CHARGE = 5;
	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		// TODO Auto-generated method stub
		return AccountType.CHECKING;
	}
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		return  baseBalance - CHECKING_SERVICE_CHARGE;
	}

	@Override
	public String toString() {
		String str="";
		str = String.format("Account type: %s %n", AccountType.CHECKING);
		str += String.format("Current bal: %s %.1f %n","", this.getBalance());
		return str;
	}
	
	
}

package lab7.prog7_3_improved_employee;

public class SavingsAccount extends Account {
	public static final double SAVING_INTEREST = 0.25;
	SavingsAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		// TODO Auto-generated method stub
		return AccountType.SAVINGS;
	}
	@Override
	public double getBalance(){
		double baseBalance=super.getBalance();
		double interest = (SAVING_INTEREST/100) * baseBalance;
		return baseBalance - interest;
	}
	@Override
	public String toString() {
		String str="";
		str = String.format("Account type: %s %n", AccountType.SAVINGS);
		str += String.format("Current bal: %s %.1f %n","", this.getBalance());
		return str;
	}
}

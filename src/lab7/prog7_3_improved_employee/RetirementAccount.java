package lab7.prog7_3_improved_employee;

public class RetirementAccount extends Account {
	public static final double RETIREMENT_PENALTY = 0.02;
	RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public AccountType getAcctType() {
		// TODO Auto-generated method stub
		return AccountType.RETIREMENT;
	}
	@Override
	public boolean makeWithdrawal(double amount) {
		//implement
		double penalty = RETIREMENT_PENALTY * super.getBalance();
		amount += penalty;
		if(amount>super.getBalance())
			return false;
		double newBalance = super.getBalance()-amount;
		super.setBalance(newBalance);
		return true;
	}
	@Override
	public String toString() {
		String str="";
		str = String.format("Account type: %s %n", AccountType.RETIREMENT);
		str += String.format("Current bal: %s %.1f %n","", this.getBalance());
		return str;
	}
}

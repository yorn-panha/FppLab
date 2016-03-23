package lab5.prog5_3_employee_with_gui.prog3_2_employee;

public class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	@SuppressWarnings("unused")
	private Employee employee;
	Account(Employee emp, AccountType acctType, double balance){
	employee = emp;
	this.acctType =acctType;
	this.balance = balance;
	}
	Account(Employee emp, AccountType acctType){
	this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
		String str = null;
		str = String.format("Account type: %-19s %n", acctType);
		str += String.format("Current bal: %s %-15.1f %n","", this.getBalance());
		return str;
	//return "type = " + acctType + ", balance = " + balance;
	}
	public void makeDeposit(double deposit) {
	//implement
		this.balance+=deposit;
	}
	public boolean makeWithdrawal(double amount) {
		//implement
		if(amount>this.balance)
			return false;
		this.balance-=amount;
		return false;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}
	
}

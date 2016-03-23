package lab7.prog7_3_improved_employee;

public abstract class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	//private AccountType acctType;
	@SuppressWarnings("unused")
	private Employee employee;
	Account(Employee emp, double balance){
	employee = emp;
	this.balance = balance;
	}
	Account(Employee emp){
	this(emp,DEFAULT_BALANCE);
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
	public abstract AccountType getAcctType();

	
}

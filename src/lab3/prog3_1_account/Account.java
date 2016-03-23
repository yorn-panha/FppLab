package lab3.prog3_1_account;

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
	return "type = " + acctType + ", balance = " + balance;
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

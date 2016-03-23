package lab7.prog7_3_improved_employee;

import java.time.LocalDate;

public class Employee {

	private AccountList accounts;
	private MyStringList acctTypeList;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		/*
		 * update, using LocalDate GregorianCalendar cal = new
		 * GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire); hireDate =
		 * cal.getTime();
		 */
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();
		acctTypeList = new MyStringList();

	}

	public void createNewChecking(double startAmount) {
		// implement
		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
		acctTypeList.add(AccountType.CHECKING.toString());
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account acct = new SavingsAccount(this, startAmount);
		accounts.add(acct);
		acctTypeList.add(AccountType.SAVINGS.toString());
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct);
		acctTypeList.add(AccountType.RETIREMENT.toString());
	}

	public String getFormattedAcctInfo() {
		// implement
		String str="";
		for(int i=0;i<accounts.size();i++){
			Account acct=accounts.get(i);
			str += acct.toString();
		}
		return str;
	}

	public void deposit(int accountIndex, double amt) {
		// implement
		Account acct = accounts.get(accountIndex);
		acct.makeDeposit(amt);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public boolean withdraw(int accountIndex, double amt) {
		
		Account acct = accounts.get(accountIndex);
		return acct.makeWithdrawal(amt);
		// implement
	}
	
	public MyStringList getNamesOfAccounts(){
		return acctTypeList ;
	}

}

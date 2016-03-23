package lab5.prog5_3_employee_with_gui.prog3_2_employee;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
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

	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);

	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		String str= "";
		if(this.checkingAcct!=null)
			str+=checkingAcct.toString();
		if(this.savingsAcct!=null)
			str+=savingsAcct.toString();
		if(this.retirementAcct!=null)
			str+=retirementAcct.toString();
		return str;
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		}
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public boolean withdraw(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			return checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return savingsAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return retirementAcct.makeWithdrawal(amt);
		}
		return false;
		// implement
	}

}

package lab7.prog7_3_improved_employee;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String mainMenu = String.format("A. See a report of all accounts. %n");
		mainMenu += String.format("B. Make a deposit. %n");
		mainMenu += String.format("C. Make a withdrawal. %n");
		mainMenu += String.format("Make a selection (A/B/C):");
		System.out.println(mainMenu);
		String answer = sc.next();
		if (answer.equalsIgnoreCase("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		if (answer.equalsIgnoreCase("b")) {
			Scanner empNumber = new Scanner(System.in);
			String empsMenu = "";
			for (int i = 0; i < emps.length; i++) {
				empsMenu += String.format("%d. %s %n", i, emps[i].getName());
			}
			empsMenu += String.format("Select an employee: (type a number)");
			System.out.println(empsMenu);

			String empIndex = empNumber.nextLine();
			Employee emp = emps[Integer.parseInt(empIndex)];
			MyStringList acctTypeList = emp.getNamesOfAccounts();
			String acctTypeMenu = "";
			for (int i = 0; i < acctTypeList.size(); i++) {
				acctTypeMenu += String.format("%d. %s %n", i,
						acctTypeList.get(i));
			}
			acctTypeMenu += String.format("Select an account: (type a number)");
			System.out.println(acctTypeMenu);

			Scanner atNumber = new Scanner(System.in);
			String acctTypeNumber = atNumber.nextLine();
			String acctType = acctTypeList
					.get(Integer.parseInt(acctTypeNumber));

			System.out.println("Deposit amount:");
			Scanner scAmt = new Scanner(System.in);
			String inputAmt = scAmt.nextLine();
			double amt = Double.parseDouble(inputAmt);
			switch (acctType.charAt(0)) {
			case 'C':
				emp.deposit(Integer.parseInt(acctTypeNumber), amt);
				break;
			case 'R':
				emp.deposit(Integer.parseInt(acctTypeNumber), amt);
				break;
			case 'S':
				emp.deposit(Integer.parseInt(acctTypeNumber), amt);
				break;
			}

			String finalResult = String.format("$ %.1f has been deposited in the %s account of %s", amt,acctType, emp.getName());
			System.out.println(finalResult);
			
			scAmt.close();
			atNumber.close();
			empNumber.close();

		}
		if (answer.equalsIgnoreCase("c")) {
			Scanner empNumber = new Scanner(System.in);
			String empsMenu = "";
			for (int i = 0; i < emps.length; i++) {
				empsMenu += String.format("%d. %s %n", i, emps[i].getName());
			}
			empsMenu += String.format("Select an employee: (type a number)");
			System.out.println(empsMenu);

			String empIndex = empNumber.nextLine();
			Employee emp = emps[Integer.parseInt(empIndex)];
			MyStringList acctTypeList = emp.getNamesOfAccounts();
			String acctTypeMenu = "";
			for (int i = 0; i < acctTypeList.size(); i++) {
				acctTypeMenu += String.format("%d. %s %n", i,
						acctTypeList.get(i));
			}
			acctTypeMenu += String.format("Select an account: (type a number)");
			System.out.println(acctTypeMenu);

			Scanner atNumber = new Scanner(System.in);
			String acctTypeNumber = atNumber.nextLine();
			String acctType = acctTypeList
					.get(Integer.parseInt(acctTypeNumber));

			System.out.println("Withdraw amount:");
			Scanner scAmt = new Scanner(System.in);
			String inputAmt = scAmt.nextLine();
			double amt = Double.parseDouble(inputAmt);
			switch (acctType.charAt(0)) {
			case 'C':
				emp.withdraw(Integer.parseInt(acctTypeNumber), amt);
				break;
			case 'R':
				emp.withdraw(Integer.parseInt(acctTypeNumber), amt);
				break;
			case 'S':
				emp.withdraw(Integer.parseInt(acctTypeNumber), amt);
				break;
			}

			String finalResult = String.format("$ %.1f has been withdrawed from the %s account of %s", amt,acctType, emp.getName());
			System.out.println(finalResult);
			
			scAmt.close();
			atNumber.close();
			empNumber.close();

		}
	}

	String getFormattedAccountInfo() {
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		String str = "";
		for (int i = 0; i < emps.length; i++) {
			str += "ACCOUNT INFO FOR " + emps[i].getName() + ":\n\n";
			str += emps[i].getFormattedAcctInfo() + "\n";
		}
		return str;
	}
}

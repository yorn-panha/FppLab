package lab3.prog3_1_account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee("Sereypanha Yorn", "Panha", 100000, 2016, 9, 01);
		Account acct1=new Account(em, AccountType.CHECKING, 300);
		Account acct2=new Account(em, AccountType.SAVINGS, 300);
		Account acct3=new Account(em, AccountType.RETIREMENT, 300);
		System.out.println(acct1.toString());
		System.out.println(acct2.toString());
		System.out.println(acct3.toString());
	}

}

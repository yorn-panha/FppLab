package lab7.prog7_6_equals.case1;


import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj ==null) return false;
		if(!(obj instanceof PersonWithJob)) return false; 
		PersonWithJob pwj = (PersonWithJob)obj;
		return this.getName().equals(pwj.getName()) && this.getDateOfBirth().equals(pwj.getDateOfBirth());
	}
}

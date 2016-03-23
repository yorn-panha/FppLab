package lab7.prog7_6_equals.case2;


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
	public boolean equals(Object ob){
		if(ob ==null) return false;
		if(ob.getClass() != this.getClass()) return false; 
		PersonWithJob pwj = (PersonWithJob)ob;
		return this.getName().equals(pwj.getName()) && this.getDateOfBirth().equals(pwj.getDateOfBirth()) && this.salary==pwj.salary;
	}
}

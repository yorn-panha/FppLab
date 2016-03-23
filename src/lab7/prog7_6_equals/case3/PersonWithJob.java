package lab7.prog7_6_equals.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private double salary;
	private Person p;
	PersonWithJob(String name,GregorianCalendar dob, double salary) {
		p = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonWithJob other = (PersonWithJob) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	*/
	
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj.getClass() != this.getClass()) return false;
		PersonWithJob pwj = (PersonWithJob)obj;
		return this.p.equals(pwj.p) && this.salary==pwj.salary;
	}
	
}

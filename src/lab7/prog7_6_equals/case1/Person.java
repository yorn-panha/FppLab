package lab7.prog7_6_equals.case1;


import java.util.GregorianCalendar;
import java.util.Objects;


public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		/*int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;*/
		return Objects.hash(name, dateOfBirth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Joe", new GregorianCalendar(200, 06, 10));
		Person p2 = new PersonWithJob("Joe", new GregorianCalendar(200, 06, 10), 20000);
		//As Persons, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}

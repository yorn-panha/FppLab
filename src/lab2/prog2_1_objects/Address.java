package lab2.prog2_1_objects;

/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * 
 * @author pcorazza
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	public Address(String str, String cit, String st, String z) {
		street = str;
		city = cit;
		state = st;
		zip = z;
	}
	/**
	 * Provides a string representation of an address.
	 */
	public String toString() {
		return street + ", " + city + ", "+ state + " " + zip;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	
	public static void main(String[] args) {
		Address a = new Address("111 Washington Ave", 
				"Fairfield", "IA", "52556");
		System.out.println(a.toString());
	}
}

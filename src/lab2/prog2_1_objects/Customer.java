package lab2.prog2_1_objects;
/**
 * Represents profile information for an Customer
 * @author Sereypanha Yorn
 *
 */
public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNumber;
	private Address billingAddres;
	private Address shippingAddress;
	
	public Customer(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
//		this.socSecurityNumber=ssn;
	}
	/**
	 * Provides a string representation of this Customer
	 */
	@Override
	public String toString() {
		return "[" + firstName + ", " + lastName
				+ ", ssn:" + socSecurityNumber + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocSecurityNumber() {
		return socSecurityNumber;
	}
	public void setSocSecurityNumber(String socSecurityNumber) {
		this.socSecurityNumber = socSecurityNumber;
	}
	public Address getBillingAddres() {
		return billingAddres;
	}
	public void setBillingAddres(Address billingAddres) {
		this.billingAddres = billingAddres;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
}

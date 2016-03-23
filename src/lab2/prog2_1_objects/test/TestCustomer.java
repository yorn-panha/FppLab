package lab2.prog2_1_objects.test;

import static org.junit.Assert.*;
import lab2.prog2_1_objects.Address;
import lab2.prog2_1_objects.Customer;

import org.junit.Test;


public class TestCustomer {

	@Test
	public void testToString() {
		Address addBilling = new Address("10 Adams", "Chicago", "IL", "52556");
		Address addShipping = new Address("110 Burlington", "Chicago", "IL", "52556");
		Customer c1 = new Customer("Joe", "Smith");
		c1.setSocSecurityNumber("332-221-4444");
		c1.setBillingAddres(addBilling);
		c1.setShippingAddress(addShipping);
		assertEquals("String representation of Customer not as expected",
				"[Joe, Smith, ssn:332-221-4444]",
				c1.toString());
		
	}
}

package lab2.prog2_1_objects;
/**
 * Creates a few Customers, stores them in an array.
 * Then locates all Customer with billing address city of Chicago
 * @author Sereypanha Yorn
 *
 */
public class Main {

	public static void main(String[] args) {
		Address add1A = new Address("10 Adams", "chicago", "IL", "52556");
		Address add1B = new Address("110 Burlington", "chicago", "IL", "52556");
		Address add2A = new Address("322 Harrison", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");
		Customer c1 = new Customer("Joe", "Smith");
		c1.setSocSecurityNumber("332-221-4444");
		c1.setBillingAddres(add1A);
		c1.setShippingAddress(add1B);
		Customer c2 = new Customer("Bill", "Jones");
		c2.setSocSecurityNumber("332-221-5555");
		c2.setBillingAddres(add2A);
		c2.setShippingAddress(add2B);
		
		/*
		System.out.println(c1.toString());
		System.out.println("Billing Addres: "+c1.getBillingAddres().toString());
		System.out.println("Shipping Address: " +c1.getShippingAddress().toString());
		*/
		
		//Create an Employee array of length 2
		Customer[] cusArray = new Customer[2];
		cusArray[0] = c1;
		cusArray[1] = c2;
		
		//Search the array for an customer having billing address in Chicago city
		//If found, print out the Employee's full name
		for(int i = 0; i < cusArray.length; ++i) {
			String city = cusArray[i].getBillingAddres().getCity();
			if(city.equalsIgnoreCase("Chicago")) {
				System.out.println("Found person who live in Chicago! " + cusArray[i].toString());
			}
		}
		// I love you
	}

}

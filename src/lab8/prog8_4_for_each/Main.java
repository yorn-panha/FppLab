package lab8.prog8_4_for_each;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	private List<Address> listOfAddresses;
	//private StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));
		

	}
	
	public void printAsUpperCase() {
		//implement
		Iterator<Address> it = listOfAddresses.iterator();
		while(it.hasNext()){
			Address ad = it.next();
			System.out.println(formatFields(ad.toUpper()));
		}
		
	}
	
	private String formatFields(List<String> list) {
		//implement
		String str = "";
			String name = list.get(0);
			String street = list.get(1);
			String city = list.get(2);
			String state = list.get(3);
			String zip = list.get(4);
		str += String.format("%s %n%s %n%s, %s, %s %n", name, street, city, state, zip);
		return str;

	}
	
	
	

}

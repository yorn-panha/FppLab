package lab11.prog11_1_hashmapAppl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<String, Double>();
	
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		String str = "";
		if(salaryRecord.containsKey(date))
			str += firstName + " " + lastName + " was paid " + salaryRecord.get(date) + " on " + date;
		else 
			str += firstName + " " + lastName + " did not receive a paycheck on " + date;
		System.out.println(str);
		
	}
	public void printAveragePaycheck() {
		//implement
		Set<Map.Entry<String, Double>> entrySet = salaryRecord.entrySet();
		Iterator<Map.Entry<String, Double>> it = entrySet.iterator();
		double average = 0.0, sum = 0.0;
		int i = 0;
		while(it.hasNext()) {
			Entry<String, Double> salaryRec = it.next();
			//salaryRec.getKey();
			System.out.println(salaryRec.getKey() + "\t" +salaryRec.getValue());
			sum += salaryRec.getValue();
			i++;
		}
		average = sum / i;
		String name = firstName + " " + lastName;
		String str = "Average paycheck for " + name + " was " + average;
		System.out.println(str);
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
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

}

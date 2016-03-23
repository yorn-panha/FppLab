package lab10.prog10_1_bst1.employeebst;
import java.util.Comparator;
public class NameComparator implements Comparator<Employee> {
	//compareTo in this case is not consistent with equals
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

}

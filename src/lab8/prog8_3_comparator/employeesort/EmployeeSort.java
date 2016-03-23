package lab8.prog8_3_comparator.employeesort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
		NameComparator nameComp = 
			new NameComparator();
		HireDateComparator hireDateComp = new HireDateComparator();
		SalaryComparator salaryComp = new SalaryComparator();
		Collections.sort(empList, nameComp);
		System.out.println("Sort by name:");
		System.out.println(empList);
		Collections.sort(empList, hireDateComp);
		System.out.println("Sort by hire date:");
		System.out.println(empList);
		Collections.sort(empList, salaryComp);
		System.out.println("Sort by salary:");
		System.out.println(empList);
		
	}

}

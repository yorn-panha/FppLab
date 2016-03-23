package lab7.prog7_1_department;

import java.time.LocalDate;

public  class DeptEmployee {
	protected String name;
	protected double salary;
	protected LocalDate hiredate;
	public  double computeSalary(){
		return salary;
	}
	public DeptEmployee(String name, double salary, LocalDate hiredate) {
		super();
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}

}

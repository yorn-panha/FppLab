package lab7.prog7_1_department;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return salary*12*overtimeHours;
	}

//	public Secretary(double overtimeHours) {
//		super();
//		this.overtimeHours = overtimeHours;
//	}

	public Secretary(String name, double salary, LocalDate hiredate,
			double overtimeHours) {
		super(name, salary, hiredate);
		this.overtimeHours = overtimeHours;
	}
	
	
	
}

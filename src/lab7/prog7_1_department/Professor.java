package lab7.prog7_1_department;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
		super(name, salary, hireDate);
		this.numberOfPublications = numberOfPublications;
	}
	

//	@Override
//	public double computeSalary() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

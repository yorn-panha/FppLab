package lab7.prog7_1_department;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LocalDateStringConverter hiredaDate = new
		// LocalDateStringConverter("01-01-2000");
		Professor p1 = new Professor("p1", 100.0, LocalDate.of(2000, 01, 01),
				10);
		Professor p2 = new Professor("p2", 100.0, LocalDate.of(2000, 01, 01),
				10);
		Professor p3 = new Professor("p3", 100.0, LocalDate.of(2000, 01, 01),
				10);

		Secretary s1 = new Secretary("s1", 100.0, LocalDate.of(2000, 01, 01),
				200);
		Secretary s2 = new Secretary("s1", 100.0, LocalDate.of(2000, 01, 01),
				200);
		DeptEmployee[] department = new DeptEmployee[5];

		department[0] = p1;

		department[1] = s2;
		department[2] = p3;
		department[3] = s1;
		department[4] = p2;


		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wish to see the sum of all salaries?: ");
		String input = sc.nextLine();
		double sumOfAllSalaries = 0.0f;
		if (input.equalsIgnoreCase("y")) {
			for (DeptEmployee de : department) {
				sumOfAllSalaries += de.computeSalary();
			}
			System.out.println("Sum of all salaries is: " + sumOfAllSalaries);
		}
		sc.close();
		System.out.println("Goodbye");

	}

}

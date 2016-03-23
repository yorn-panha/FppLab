package lab2.prog2_7_format;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		output = String.format("%16d %12d %12d %12d %n %n", 8, 10,31,99);
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", 23, "+", 17, "+", 9, "+", 42);
		output += String.format("%16s %12s %12s %12s %n %n %n %n %n %n","____", "____","____","____");
		
		output += String.format("%16d %12d %12d %12d %n %n", 83, 67,39,5);
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n", "+", 17, "+", 7, "+", 19, "+", 49);
		output += String.format("%16s %12s %12s %12s %n %n %n %n","____", "____","____","____");
		System.out.println(output);
	}

}

package lab12.prog12_4_rational;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational(2, -3);
		Rational r2 = new Rational(-17, 5);
		Rational r3 = new Rational(1, 3);
		
		Rational result1 = (r1.multiply(r2)).add(r3);
		Rational result2 = r1.multiply(r2.add(r3));
		
		String str ="";
		if(result1.compareTo(result2)==0) {
			str = "equal to ";
		}else if(result1.compareTo(result2)==-1) {
			str = "less than ";
		} else
			str = "greater than ";
		System.out.println("(" + r1 + " * " + r2 + ") + " + r3 + " is " + str + r1 +" * (" + r2 + " + " + r3 +")");
	}

}

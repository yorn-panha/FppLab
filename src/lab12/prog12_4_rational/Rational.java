package lab12.prog12_4_rational;

import java.util.Objects;

public class Rational {
	private int p;
	private int q;
	public Rational(int p, int q) {
		super();
		this.p = p;
		this.q = q;
		if(q<0) throw new IllegalArgumentException("q cannot less than zero");
		return;
	}
	//adds the rational rat to this Rational
	//multiplies rat by this Rational
	public Rational add(Rational rat) {
		Rational result = new Rational(0,0);
		int rQ = this.q * rat.q;
		int rP = (this.p * rat.q) + (this.q * rat.p);
		result.setP(rP);
		result.setQ(rQ);
		return result;
		
	}
	public Rational multiply(Rational rat) {
		Rational result = new Rational(0,0);
		int rQ = this.q * rat.q;
		int rP = (this.p * rat.p);
		result.setP(rP);
		result.setQ(rQ);
		return result;
		
	}
	//returns -1 if this rational is less than rat
	//returns 0 if this rational equals (see equals
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		 if(this.p * rat.p < this.q * rat.q) 
			 return -1;
		 if(this.equals(rat))
			 return 0;
		 if(this.p * rat.p > this.q * rat.q)
			 return 1;
		 return 0;
		 
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(p, q);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		return (this.p * this.q == other.p * other.q);
	}
	
	
	@Override
	public String toString() {
		return p + "/" + q;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getQ() {
		return q;
	}
	public void setQ(int q) {
		this.q = q;
	}
	
}

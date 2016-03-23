package lab4.prog4_1_exp;

public class Exponential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exponential e=new Exponential();
		System.out.println(e.power(2, 10));

	}
	double power(double x,int n){
		if(n==1)
			return x;
		return x*power(x, n-1);
	}
}

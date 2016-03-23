package lab2.prog2_3_round;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x=1.27f,y=3.881f,z=9.6f;
		int sum1=0,sum2=0;
		sum1=(int)(x+y+z);	
		sum2=Math.round(x+y+z);
		System.out.println("x+y+z="+(x+y+z));
		System.out.println("sum1 by case="+sum1);
		System.out.println("sum2 by round="+sum2);
	}

}

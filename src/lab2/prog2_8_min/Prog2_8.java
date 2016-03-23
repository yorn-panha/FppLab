package lab2.prog2_8_min;

public class Prog2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int min=min(intArray);
		System.out.println(min);
	}
	public static int min(int[] arrayOfInts){
		int min=arrayOfInts[0];
		for(int i=1;i<arrayOfInts.length;i++){
			if(min>arrayOfInts[i])
				min=arrayOfInts[i];
		}
		return min;
	}
	
}

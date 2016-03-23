package lab7.prog7_5_closed_curve3;


public interface Polygon {
	
	public double[] getArrayOfSides();
	static double sum(double[] arr){
		double sum=0;
		for(int i=0;i<arr.length;i++){
			sum +=arr[i];
		}
		return sum;
	}
	default double computePerimeter(){
		return sum(getArrayOfSides());
	}
}
 
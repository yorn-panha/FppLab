package lab7.prog7_5_closed_curve3;

public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;

	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}


	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}


	@Override
	public double[] getArrayOfSides() {
		// TODO Auto-generated method stub
		return new double[]{width, width, length,length};
	}
	
}

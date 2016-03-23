package lab7.prog7_4_closed_curve2;

public class Rectangle extends ClosedCurve implements Polygon {
	private double width;
	private double length;

	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}


	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}


	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (width + length) * 2;
	}


	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}
	
}

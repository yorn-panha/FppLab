package lab7.prog7_2_closed_curve;

public class Rectangle extends ClosedCurve {
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
	
}

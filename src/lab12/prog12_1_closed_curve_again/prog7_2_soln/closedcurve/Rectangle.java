package lab12.prog12_1_closed_curve_again.prog7_2_soln.closedcurve;

import lab12.prog12_1_closed_curve_again.exceptions.IllegalClosedCurveException;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{

		if(length < 0 || width < 0 )
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance");
		this.length = length;
		this.width = width;

	}
	double computeArea() {
		return width*length;
	}
	public void setWidth(double width) throws IllegalClosedCurveException {
		if(width < 0 )
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance");
		this.width = width;
	}
	public void setLength(double length) throws IllegalClosedCurveException {
		if(length < 0 )
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Rectangle instance");
		this.length = length;
	}
	


}

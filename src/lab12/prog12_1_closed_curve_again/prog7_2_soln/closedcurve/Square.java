package lab12.prog12_1_closed_curve_again.prog7_2_soln.closedcurve;

import lab12.prog12_1_closed_curve_again.exceptions.IllegalClosedCurveException;

public class Square extends ClosedCurve {
	private double side;
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
		if(side < 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Square instance");
		}
	}
	public Square(double side) throws IllegalClosedCurveException {
		if(side < 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Square instance");
		}
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}
	public void setSide(double side) throws IllegalClosedCurveException {
		if(side < 0) {
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Square instance");
		}
		this.side = side;
	}

}

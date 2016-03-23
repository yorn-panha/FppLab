package lab12.prog12_1_closed_curve_again.prog7_2_soln.closedcurve;

import lab12.prog12_1_closed_curve_again.exceptions.IllegalClosedCurveException;

public class Circle extends ClosedCurve {
	private double radius;
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
		if(radius < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Circle instance");
		
	}
	public Circle(double radius) throws IllegalClosedCurveException {
		if(radius < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Circle instance");
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
	public void setRadius(double radius) throws IllegalClosedCurveException {
		if(radius < 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Circle instance");
		this.radius = radius;
	}
	
}

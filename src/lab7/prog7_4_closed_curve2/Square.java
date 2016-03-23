package lab7.prog7_4_closed_curve2;
public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}
	
	@Override
	public double computeArea() {
		return side * side;
	}


}

package lab3.prog3_4_figures;

public final class Rectangle {
	private final double width;
	private final double length;
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double computeArea(){
		return width*length;
	}
	@Override
	public String toString() {
//		return "Area of Rectangle is "+computeArea();
		return String.format("Area of Rectangle is %.2f", computeArea());
	}
}

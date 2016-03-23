package lab3.prog3_4_figures;

public final class Circle {
	private final double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return this.radius;
	}
	public double computeArea(){
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		//return "Area of Circle is "+computeArea();
		return String.format("Area of Circle is %.2f", computeArea());
	}
	
}

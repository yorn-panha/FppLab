package lab3.prog3_4_figures;

public final class Triangle {
	private final double base;
	private final double heigth;
	public Triangle(double base, double heigth) {
		this.base = base;
		this.heigth = heigth;
	}
	public Triangle(double s1,double s2,double s3){
		this.base= s1>s2?(s1>s3?s1:s3):(s2>s3?s2:s3);
		
		double s=(s1+s2+s3)/2;
//		Area = sqr(s(s-a)(s-b)(s-c).
//		Area = 1/2 base * heigth		
		double a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));		
		this.heigth=(2*a)/base;
//		System.out.println("s="+s);
//		System.out.println("Area="+a);
//		System.out.println("base="+base+", heigth="+heigth);
	}
	
	
	
	public double getBase() {
		return base;
	}
	public double getHeigth() {
		return heigth;
	}
	public double computeArea(){
		return (base*heigth)/2;
	}
	@Override
	public String toString() {
//		return "Area of Triangle is "+computeArea();
		return String.format("Area of Triangle is %.2f", computeArea());
	}
	
}

package lab3.prog3_4_figures;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(10);
		Rectangle r=new Rectangle(3, 5);
		Triangle t=new Triangle(4, 3);
		Triangle t1=new Triangle(4, 3, 5);
		System.out.println(c.toString());
		System.out.println(r.toString());
		System.out.println(t.toString());
		System.out.println(t1.toString());		
	}
}

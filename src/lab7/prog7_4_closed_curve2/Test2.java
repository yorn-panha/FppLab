package lab7.prog7_4_closed_curve2;
public class Test2 {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
								 
								 new Rectangle(4,5),
								 new Triangle(2,3,4)};
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.println(cc.computeArea());
			
		}
    
	}

}
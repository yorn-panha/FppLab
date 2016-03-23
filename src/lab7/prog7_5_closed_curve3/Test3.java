package lab7.prog7_5_closed_curve3;
public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(4,5)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this "+ cc.getClass().getSimpleName());
			System.out.println("Perimeter =" + cc.computePerimeter());
			
		}
    
	}

}
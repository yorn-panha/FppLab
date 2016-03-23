package lab7.prog7_4_closed_curve2;
public class Test {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Triangle(2,3,4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this "+ cc.getClass().getSimpleName());
			System.out.println("Number of sides =" + cc.getNumberOfSides());
			System.out.println("Perimeter =" + cc.computePerimeter());
			
			
		}
    
	}

}
package lab12.prog12_1_closed_curve_again.prog7_2_soln.closedcurve;

import java.util.logging.Logger;

import lab12.prog12_1_closed_curve_again.exceptions.IllegalClosedCurveException;

public class Test {
	private static Logger log = Logger.getLogger("close curve");
	public static void main(String[] args) {
		

		/*ClosedCurve[] objects = {new Triangle(-4,5,6),
								 new Square(-3),
								 new Rectangle(-3,7),
								 new Circle(-3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = getClassNameNoPackage(cc.getClass());
			System.out.println("The area of this "+ nameOfCurve+ " is "+ cc.computeArea());
							
			}*/
		try {
			Triangle t1 = new Triangle(0,5,6);
		} catch (IllegalClosedCurveException e) {
			// TODO Auto-generated catch block
			log.info("Hello!");
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			Circle c1 = new Circle(-9);
		} catch (IllegalClosedCurveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			Rectangle R1 = new Rectangle(-2,3);
		} catch (IllegalClosedCurveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		try {
			Square s1 = new Square(-3);
		} catch (IllegalClosedCurveException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		
	}
	public static String getClassNameNoPackage(Class aClass){ 
        String fullClassName = aClass.getName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;
        
        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
				  //for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }    
	    	

	}

}

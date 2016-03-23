package lab6.prog6_2_inst_inner;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	// returns the value in the instance vble of Bottom
	int readBottom() {
		// implement
		mid=new Middle();
		midbot=mid.new Bottom();
		
		return midbot.b;
	}

	class Middle {
		int m = 2;

		// returns sum of instance vble in Top and
		// instance vble in Bottom
		int addTopAndBottom() {
			// implement
			midbot = new Bottom();
			
			return t + midbot.b;
		}

		class Bottom {
			int b = 3;

			// returns the product of the instance vbles
			// in all three classes
			int multiplyAllThree() {
				// implement
				return b*m*t;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}

}

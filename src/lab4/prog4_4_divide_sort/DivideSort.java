package lab4.prog4_4_divide_sort;

public class DivideSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="acbaziewdfadf";
		System.out.println(divideSort(s));
	}

	static String divideSort(String s){
		Merge m=new Merge();
		int len=s.length();
		if(len==1||len==0)
			return s;
		int mid=len/2;
//		String subleft=s.substring(0,mid);
//		String subright=s.substring(mid);
//		divideSort(sleft);
//		divideSort(sright);
		String sleft=divideSort(s.substring(0,mid));
		String sright=divideSort(s.substring(mid));
		String result= m.merge(sleft, sright);
		return result;
		
	}
}


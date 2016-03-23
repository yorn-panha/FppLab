package lab4.progEC4_5_sum;

public class StringSum {
	static int COUNT=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="11111111";
		
		System.out.println("Sum="+sum(s));
		System.out.println("string length="+s.length()+",count="+COUNT);
	}
	static int sum(String s){
		COUNT++;
		int len=s.length();
		int mid=len/2;
		if(len==1)
			return Integer.parseInt(s);
		if(s.charAt(mid)=='1'){
			String subLeft=s.substring(0,mid);
			String subRight=s.substring(mid);
			int lenRight=subRight.length();
			
			return lenRight+sum(subLeft);
		}else{
		//if(s.charAt(mid)=='0'){
			String subRight=s.substring(mid);
			return sum(subRight);
		}
		
		//return mid;
		
	}

}

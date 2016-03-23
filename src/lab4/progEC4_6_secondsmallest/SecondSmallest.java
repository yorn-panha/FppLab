package lab4.progEC4_6_secondsmallest;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(secondSmallest("aaaacccwautavavmn"));

	}
	static char secondSmallest(String s){
		
		char min=min(s);
		if(s.indexOf(min)!=s.length()-1){ //move the smallest to the back of the string
			int minpos=s.indexOf(min);
			if(min==s.charAt(s.length()-1))
				s=s.substring(0, minpos)+s.substring(minpos+1); //if the first smallest value already move to the back
			else 
				s=s.substring(0, minpos)+s.substring(minpos+1)+min;
		}

		char fChar=s.charAt(0);
		char sChar=s.charAt(1);
		/*
		 * base case, when there are only two values, the second smallest and the smallest.
		 */
		if(s.length()==2)
			return fChar;
		
		if((fChar<sChar && fChar!=min) || sChar==min) {  //if the first ch is smaller than the second ch, and the first ch is not smallest, or the second ch is the smallest
			s=fChar+s.substring(2);
			return secondSmallest(s);
		}
		else {
			s=sChar+s.substring(2);
			return secondSmallest(s);
		}		
		
	}
/*	static char ndLargest(String s){
		char[] ch = new char[s.length()];
		for(int i=0;i<ch.length;i++){
			ch[i]=s.charAt(i);
		}
		char min=ch[0];
		for(int i=1;i<ch.length;i++){
			if(min>ch[i]){
				min=ch[i];
			}
		}
		char second=ch[0];
		for(int i=1;i<ch.length;i++){
			if(min<second&&second>ch[i]&(ch[i]!=min)){
				second=ch[i];
			}
		}
		return second;
	}
	*/
	   public static Character min(String str) {
			if(str == null || str.length() == 0) {
			return null;
			}
			char ch = str.charAt(0);
			if(str.length() == 1) return ch;
			char c = min(str.substring(1));
			return (ch < c ? ch : c);
			}

}

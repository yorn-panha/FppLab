package lab4.prog4_3_search;

public class BinSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		System.out.println(search(s,'e'));
	}
	static boolean search(String s,char c){
		int len=s.length();
		if(len==0){
			return false;
		}
		int m=len/2;

		char ch=s.charAt(m);
		if(len==1&&c!=ch)
			return false;
		if(c==ch)
			return true;
		if(c<ch){
			s=s.substring(0,m);
			return search(s,c);
		}
		if(c>ch){
			s=s.substring(m+1);
			return search(s,c);
		}
		return false;
	}

}

package lab4.prog4_2_recur_min_sort;

public class MinSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}
	String sort(String str){
		if(str.length()==0){
			return str;
		}
		int minpos=str.indexOf(min(str));
		char first=str.charAt(0);
		char ch=str.charAt(minpos);
		if(minpos==0){
			str=str.substring(1);
		}else{
			str=str.substring(1, minpos)+first+str.substring(minpos + 1);
		}
		
		return ch + sort(str);
	}

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

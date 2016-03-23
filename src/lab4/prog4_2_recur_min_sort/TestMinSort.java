package lab4.prog4_2_recur_min_sort;


import org.junit.Test;

public class TestMinSort {

	@Test
	public void test() {
		String str="zwxuabfkafutbbbb";
			int minpos=str.indexOf(MinSort.min(str));
			char first=str.charAt(0);
			char ch=str.charAt(minpos);
			str=ch+str.substring(1, minpos)+first+str.substring(minpos+1);
//			System.out.println(ch);
//			System.out.println(str.substring(1, minpos));
//			System.out.println(first);
//			System.out.println(str.substring(minpos+1));
			System.out.println(str);
		}
	}


package lab3.prog3_3_string_list;

import java.util.Arrays;

import org.junit.Test;

public class ResizeTest {

	@Test
	public void test() {
		int size=2;
		String[] strArray=new String[size];
		strArray[0]="a";
		strArray[1]="b";
		String[] temp=new String[size];
		System.arraycopy(strArray, 0, temp, 0, size);
		strArray=new String[size*2];
		System.arraycopy(temp, 0, strArray, 0, size);
		System.out.println(strArray.length);
//		for(String s:strArray){
//			System.out.println(s);
//		}
		System.out.println(Arrays.toString(strArray));
	}

}

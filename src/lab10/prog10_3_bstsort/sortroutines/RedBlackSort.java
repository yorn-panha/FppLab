package lab10.prog10_3_bstsort.sortroutines;
import lab10.prog10_3_bstsort.runtime.*;
import java.util.*;

/** This class sorts by inserting into a red black tree and then outputting the results*/
public class RedBlackSort extends Sorter{
	TreeSet<Integer> tree = new TreeSet<>();
	public int[] sort(int[] arr){
		if(arr==null || arr.length < 2) return arr;
		tree.clear();
		for(int i = 0; i < arr.length; ++i){
			tree.add(arr[i]);
		}
		int j = 0;
		for(Integer x : tree) {
			arr[j++] = x;
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int[] test = {10,13,1,4, 3000,21,-2, 42};
		RedBlackSort ss = new RedBlackSort();
		int[] output = ss.sort(test);
		System.out.println(Arrays.toString(output));
	}
}

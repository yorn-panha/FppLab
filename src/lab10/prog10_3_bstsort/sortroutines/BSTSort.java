package lab10.prog10_3_bstsort.sortroutines;

import java.util.Arrays;

import lab10.prog10_3_bstsort.runtime.Sorter;

public class BSTSort extends Sorter {
	MyBST myBST = new MyBST();

	@Override
	public int[] sort(int[] arr) {
		
		int len = arr.length;
		System.out.println("-----------input array size----------" + len);
		myBST.initArr(len);
		for(int i=0; i<len; i++)
			myBST.insert(arr[i]);
		//myBST.printTree();
		return myBST.print(myBST.getRoot());
	}
	public static void main(String[] args) {
		BSTSort bt = new BSTSort();
		int[] input = new int[1000];
		for(int i =0; i<1000; i++)
			input[i] = 1000-i;
		int[] arr = bt.sort(input);
		bt.sort(input);
		System.out.println(Arrays.toString(arr));
	}

}

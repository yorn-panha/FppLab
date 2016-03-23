package lab9.prog9_4_stacks_in_array;

public enum TwoStacks {
	INSTANCE;
	
	private String[] arr = new String[20];
	
	//resizes the array arr and copies values as needed
	public void resize() {
		int len = arr.length;
		String[] temp = new String[len];
		System.arraycopy(arr, 0, temp, 0, len);
		arr = new String[len * 2];
		int arrLen = arr.length;
		int size1 = FirstStack.size;
		int size2 = SecondStack.size;
		
		System.arraycopy(temp, 0,arr , 0, size1);
		System.arraycopy(temp, len-size2, arr, arrLen - size2, size2);
		
		System.out.println("Resizing...Array size is " + arrLen);
	}
	
	static enum FirstStack {
		FIRST;
		static int size = 0;
		public void push(String s) { 
			int arrSize = INSTANCE.arr.length;
			if(size + SecondStack.size == arrSize) {
				INSTANCE.resize();
			}
			INSTANCE.arr[size++] = s;
		}
		public String pop() {
			//int arrSize = INSTANCE.arr.length;
			String temp = INSTANCE.arr[size];
			INSTANCE.arr[size] = null;
			size--;
			return temp;
		}
		public String peek() {
			return INSTANCE.arr[size];
		}
		public int getSize() {
			return size;
		}
		public String toString() {
			String str = "";
			for(int i =0; i < size; i++) {
				str += INSTANCE.arr[i] + " ";
			}
			return str;
		}
	}
	
	static enum SecondStack {
		SECOND;
		static int size = 0;
		public void push(String s) {
			int arrSize = INSTANCE.arr.length;
			if(size + FirstStack.size == arrSize) {
				INSTANCE.resize();
				arrSize = INSTANCE.arr.length;
			}
			INSTANCE.arr[arrSize - 1 - size++] = s;
		}
		public String pop() {
			int arrSize = INSTANCE.arr.length;
			String temp = INSTANCE.arr[arrSize - 1 - size];
			INSTANCE.arr[arrSize - 1 - size] = null;
			size--;
			return temp;
		}
		public String peek() {
			int arrSize = INSTANCE.arr.length;
			return INSTANCE.arr[arrSize - 1 - size];
		}
		public int getSize() {
			return size;
		}
		public String toString() {
			int arrSize = INSTANCE.arr.length;
			String str = "";
			for(int i =arrSize-1; i > arrSize-1-size; i--) {
				str += INSTANCE.arr[i] + " ";
			}
			return str;
		}
	}
	//test your implementation
	public static void main(String[] args) {
		//TwoStacks t = TwoStacks.INSTANCE;
		TwoStacks.FirstStack first = TwoStacks.FirstStack.FIRST;
		TwoStacks.SecondStack second = TwoStacks.SecondStack.SECOND;
		
		first.push("Tom");
		second.push("Bill");
		first.push("Steve");
		second.push("Rich");
		System.out.println("First stack: " + first);
		System.out.println("Second stack: " + second);
		for(int i = 0; i < 45; ++i) {
			String str = "A" + i;
			first.push(str);
		}
		for(int i = 0; i < 45; ++i) {
			String str = "B" + i;
			second.push(str);
		}
		for(int i = 0; i < 30; ++i) {
			first.pop();
		}
		for(int i = 0; i < 60; ++i) {
			second.push("C" + i);
		}
		System.out.println("First stack: " + first);
		System.out.println("Second stack: " + second);
		
		
		
	}
}

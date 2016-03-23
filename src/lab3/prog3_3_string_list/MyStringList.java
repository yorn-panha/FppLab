package lab3.prog3_3_string_list;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		// implement
		if (size == strArray.length) {
			this.resize();
		}
		strArray[size++] = s;
	}

	public String get(int i) {
		// implement
		return strArray[i];
	}

	public boolean find(String s) {
		// implemement
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s))
				return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		// implement
		size++;
		for (int i = size - 1; i > pos; i--) {
			strArray[i] = strArray[i - 1];
		}
		strArray[pos] = s;
	}

	public boolean remove(String s) {
		// implement
		int i = 0;
		if (this.find(s)) {
			for (i = 0; i < size; i++) {
				if (s.equals(strArray[i]))
					break;
			}
			for (int j = i; j < size; j++) {
				strArray[j] = strArray[j + 1];
			}
			strArray[size--] = null;
			return true;

		} else
			return false;
	}

	private void resize() {
		// implement
		String[] temp = new String[size];
		System.arraycopy(strArray, 0, temp, 0, size);
		strArray = new String[size * 2];
		System.arraycopy(temp, 0, strArray, 0, size);
		System.out.println("Resizing...");
	}

	public String toString() {
		// implement
		// [Bob, Steve, Susan, Mark, Dave]
		// return Arrays.toString(strArray);
		String str = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				str += strArray[i];
				break;
			}
			str += strArray[i] + ", ";
		}
		str += "]";
		return str;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size()
				+ " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size()
				+ " after inserting Tonya into pos 0 is " + l);
	}

}

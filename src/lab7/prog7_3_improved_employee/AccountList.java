package lab7.prog7_3_improved_employee;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] acctArray;
	private int size;

	public AccountList() {
		acctArray = new Account[INITIAL_LENGTH];
		size = 0;
	}

	public void add(Account acct) {
		// implement
		if (size == acctArray.length) {
			this.resize();
		}
		acctArray[size++] = acct;
	}

	public Account get(int i) {
		// implement
		return acctArray[i];
	}

	/*public boolean find(Account s) {
		// implemement
		for (int i = 0; i < size; i++) {
			if (acctArray[i].equals(s))
				return true;
		}
		return false;
	}*/

	/*public void insert(String s, int pos) {
		// implement
		size++;
		for (int i = size - 1; i > pos; i--) {
			acctArray[i] = acctArray[i - 1];
		}
		acctArray[pos] = s;
	}*/

	/*public boolean remove(String s) {
		// implement
		int i = 0;
		if (this.find(s)) {
			for (i = 0; i < size; i++) {
				if (s.equals(acctArray[i]))
					break;
			}
			for (int j = i; j < size; j++) {
				acctArray[j] = acctArray[j + 1];
			}
			acctArray[size--] = null;
			return true;

		} else
			return false;
	}*/

	private void resize() {
		// implement
		Account[] temp = new Account[size];
		System.arraycopy(acctArray, 0, temp, 0, size);
		acctArray = new Account[size * 2];
		System.arraycopy(temp, 0, acctArray, 0, size);
		//System.out.println("Resizing...");
	}

	/*public String toString() {
		// implement
		// [Bob, Steve, Susan, Mark, Dave]
		// return Arrays.toString(acctArray);
		String str = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				str += acctArray[i];
				break;
			}
			str += acctArray[i] + ", ";
		}
		str += "]";
		return str;
	}*/

	public int size() {
		return size;
	}

}

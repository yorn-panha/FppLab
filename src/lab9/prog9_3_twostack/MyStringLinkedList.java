package lab9.prog9_3_twostack;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void add(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}
	public int getSize() {
		int size=0;
		Node t = header.next;
		while(t != null) {
			size++;
			t = t.next;
		}
		return size;
	}
	// inserts a new Node contain data so that its
	// position in the list is now pos
	void insert(String data, int pos) {
		Node insertNode = new Node(null, null, data);
		Node pre = header;
		Node nex = header.next;
		int position = 0;
		while (nex != null) {
			position++;
			if (position == pos) {
				pre.next = insertNode;
				insertNode.next = nex;
				nex.previous = insertNode;
				insertNode.previous = pre;
			}
			pre = nex;
			nex = nex.next;
		}
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		Node pre = header;
		Node nex = header.next;
		while (nex != null) {
			if (nex.value.equals(data)) {
				nex.next.previous = pre;
				pre.next = nex.next;
				nex = null;
				return true;
			}
			pre = nex;
			nex = nex.next;
		}
		return false;
	}

	String remove() {
		String removeNodeValue = "";
		Node pre = header;
		Node nex = header.next;
		if (nex != null) {
			if(nex.next == null) {
				removeNodeValue = nex.value;
				nex = null;
				header.next = null;
				return removeNodeValue;
			}
			nex.next.previous = pre;
			pre.next = nex.next;
			removeNodeValue = nex.value;
			nex = null;
			return removeNodeValue;

		}
		return removeNodeValue;
	}
	String getFirst() {
		Node nex = header.next;
		if (nex != null)
			return nex.value;
		return "";
	}

	public void sort() {
		// if(strArray == null || strArray.length <=1) return;
		Node nex = header.next;
		// int temp = 0;
		while (nex != null) {
			Node nextMinNode = minNode(nex);
			swap(nex, nextMinNode);
			nex = nex.next;
		}
	}

	void swap(Node n1, Node n2) {
		String tempValue = n1.value;
		n1.value = n2.value;
		n2.value = tempValue;
	}

	// find minimum of arr between the indices bottom and top
	public Node minNode(Node n) {
		// return location of min, not the min itself
		Node minNode = n;
		Node nex = n.next;
		while (nex != null) {
			if (nex.value.compareTo(minNode.value) < 0) {
				minNode = nex;
			}
			nex = nex.next;
		}
		return minNode;
	}

	boolean search(String s) {
		if (s == null)
			return false;
		// start node for searches is header.node
		Node node = header.next;
		while (node != null) {
			String t = node.value;
			if (s.equals(t)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

	void printNodes() {
		Node node = header.next;
		while (node != null) {
			System.out.print(node);
			node = node.next;
		}
		System.out.println();
	}
	String toStringFormat() {
		String str="";
		Node node = header.next;
		while (node != null) {
			str += node.value + " ";
			node = node.next;
		}
		return str;
	}

	@Override
	public String toString() {
		return header.value;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			return value + " ";
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList myList = new MyStringLinkedList();
		myList.add("big");
		myList.add("small");
		myList.add("tall");
		myList.add("short");
		myList.add("round");
		myList.add("square");
		myList.add("enormous");
		myList.add("tiny");
		myList.add("gargantuan");
		myList.add("lilliputian");
		myList.add("numberless");
		myList.add("none");
		myList.add("vast");
		myList.add("miniscule");
		// myList.printNodes();
		// myList.sort();
		System.out.println("My String list:");
		myList.printNodes();
		myList.remove("small");
		System.out.println("After remove \"small\"");
		myList.printNodes();
		myList.insert("small", 1);
		System.out.println("After insert \"small\" to position 1");
		myList.printNodes();
		System.out.println("Search for \"small\": " + myList.search("small"));
		System.out.println("Search for \"good\": " + myList.search("good"));

		// myList.add("a");
		// myList.add("b");
		// myList.add("w");
		// myList.add("x");
		// myList.add("y");
		// myList.add("c");
		// myList.add("d");
		// myList.printNodes();
		myList.sort();
		myList.printNodes();

	}
}

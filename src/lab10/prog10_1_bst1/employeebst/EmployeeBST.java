package lab10.prog10_1_bst1.employeebst;




public class EmployeeBST {
	private Node root;

	//start with an empty tree
	public EmployeeBST(NameComparator np) {
		root = null;
	}
	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}
	
	public void insert(Employee x) {
		if (root == null) {
			root = new Node(x, null, null);
		}
		else {
			Node n = root;
			boolean inserted = false;
			while(!inserted){
				NameComparator np = new NameComparator();
				if(np.compare(x, n.element) < 0) {
			//	if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.left;
					}
				}
				else if(np.compare(x, n.element) >= 0){ 
				//else if(x.compareTo(n.element)>=0){ 
					//space found on the right					
					if(n.right==null){
						n.right = new Node(x,null,null);
						inserted = true;
					}
					else {
						n = n.right;
					}
				}
				
			}

		}
	}
	
	
	private class Node {
		private Employee element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
		// Constructors
		@SuppressWarnings("unused")
		Node(Employee theElement) {
			this(theElement, null, null);
		}

		Node(Employee element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}
}

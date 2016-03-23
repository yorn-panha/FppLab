package lab9.prog9_3_twostack;

public class MyStringStack {
	private MyStringLinkedList myStack;
	
	public MyStringStack() {
		myStack = new MyStringLinkedList();
	}
	
	public void push(String value) {
		myStack.add(value);
	}
	
	public String pop() {
		return myStack.remove();
	}
	
	public String peek() {
		return myStack.getFirst();
	}
	public void printStack() {
		myStack.printNodes();
	}
	public int getSize() {
		return myStack.getSize();
	}
	public String toStringFormat() {
		return myStack.toStringFormat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyStringStack s = new MyStringStack();
//		s.push("a");
//		s.push("c");
//		s.push("w");
//		s.push("b");
//		s.printStack();
//		System.out.println("peek stack: " + s.peek());
//		System.out.println("pop stack: " + s.pop());
//		s.printStack();
//		System.out.println("peek stack: " + s.peek());
		
		
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		stack.printStack();
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
		stack.printStack();
	}

}

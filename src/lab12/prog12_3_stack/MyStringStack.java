package lab12.prog12_3_stack;

import lab12.prog12_3_stack.exception.StackException;

public class MyStringStack {
	private MyStringLinkedList myStack;
	
	public MyStringStack() {
		myStack = new MyStringLinkedList();
	}
	
	public void push(String value) {
		myStack.add(value);
	}
	
	public String pop() throws StackException {
		if(getSize() == 0) {
			throw new StackException("Empty Stack.");
		}
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
		try {
			System.out.println("Popping…"+stack.pop());
			System.out.println("Peeking…."+stack.peek());
			System.out.println("Popping…"+stack.pop());
			System.out.println("Popping…"+stack.pop());
			System.out.println("Popping…"+stack.pop());
			System.out.println("Popping…"+stack.pop());
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}

		stack.printStack();
	}

}

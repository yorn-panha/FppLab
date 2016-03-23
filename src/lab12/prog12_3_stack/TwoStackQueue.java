package lab12.prog12_3_stack;

import lab12.prog12_3_stack.exception.StackException;

public class TwoStackQueue {
	//replace these Java Stacks with your own implementation from 9-1
	MyStringStack stack1;
	MyStringStack stack2;
	public TwoStackQueue() {
		stack1 = new MyStringStack();
		stack2 = new MyStringStack();
	}
	
	/**
	 * Removes and returns element from front of queue
	 * @throws StackException 
	 */
	public String dequeue() throws StackException {
		//implement using your stacks
		//MyStringStack tempStack;
		String dequeueString;
		while(size() > 0) {
			String t = stack1.pop();
//			stack1.printStack();
//			System.out.println("stack1 size: " + size());
			stack2.push(t);
//			stack2.printStack();
//			System.out.println("stack2 size: " + stack2.getSize());
		}
		dequeueString = stack2.pop();
		while(stack2.getSize()>0) {
			String t = stack2.pop();
			stack1.push(t);
		}
		stack2 = new MyStringStack();
		return dequeueString;
	}
	
	/**
	 * Adds an element to the end of the queue
	 */
	public void enqueue(String s) {
		//implement using your stacks
		stack1.push(s);
	}
	
	/**
	 * Returns but does not remove element at front of queue
	 */
	public String peek() {
		return stack1.peek();
	}
	
	/**
	 * Returns number of elements currently in queue
	 */
	public int size() {
		//implement
		return stack1.getSize();
	}
	
	/**
	 * Represents elements of queue in their current order as a String
	 * @param args
	 */
	@Override
	public String toString() {
		//implement
		return stack1.toStringFormat();
	}
	
	//Test your queue with this main method
	public static void main(String[] args) {
		TwoStackQueue queue = new TwoStackQueue();
		queue.enqueue("Bob");
		queue.enqueue("Tom");
		queue.enqueue("George");
		queue.enqueue("Harold");
		System.out.println(queue);
		//System.out.println(queue.peek());
		try {
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		} catch (StackException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(queue);
		System.out.println(queue.peek());
		
		
	}
	
}

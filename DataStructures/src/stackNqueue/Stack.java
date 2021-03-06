package stackNqueue;
import org.junit.Test;

import LinkedList.Node;

public class Stack {
	Node top;
	private int size;
	
	public Stack(){
		size = 0;
	}
	
	Object pop() {
		if (top != null) {
			Object item = top.data;
			top = top.next;
			size--;
			return item;
		}
		return null;
	}

	void push(Object item) {
		Node t = new Node((int)item);
		t.next = top;
		top = t;
		size++;
	}

	Object peek() {
		return top.data;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}

}

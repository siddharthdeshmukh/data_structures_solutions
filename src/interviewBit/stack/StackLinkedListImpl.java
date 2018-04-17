package interviewBit.stack;

public class StackLinkedListImpl<T> implements IStack<T> {
	private Node top;

	public StackLinkedListImpl() {
		top = null;
	}

	@Override
	public void push(T data) {
		Node newHead = new Node(data);
		newHead.next = top;
		top = newHead;
	}

	@Override
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Empty, nothing to pop");
			return;
		}
		top = top.next;

	}

	@Override
	public T top() {

		return top.data;
	}

	@Override
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		
		return false;
	}

	public class Node {
		private T data;
		private Node next;

		public Node(T data) {
			this.data = data;
		}
	}

}

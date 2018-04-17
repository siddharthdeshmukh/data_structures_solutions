package interviewBit.stack;

public class StackImpl<T> implements IStack<T> {

	private int top;
	private static final int MAX_SIZE=10;
	private T[] statckArray;

	@SuppressWarnings("unchecked")
	public StackImpl() {
		top =-1;
		statckArray =  (T[]) new Object[MAX_SIZE];
	}
	
	public void push(T data)  {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}
		top = top+1;
		statckArray[top]=data;
	}
	
	public void pop() {
		if(top ==-1) {
			System.out.println("Stack is empty, nothing to pop");
			return;
		}
		top = top-1;
	}

	public T top() {
		return statckArray[top];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(top == MAX_SIZE -1) {
			return true;
		}
		return false;
	}
}

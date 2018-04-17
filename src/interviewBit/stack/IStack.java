package interviewBit.stack;

public interface IStack<T> {
	
	public void push(T data);
	public void pop();
	public T top();
	public boolean isEmpty();
	public boolean isFull();
	
	public default boolean extraMethodTocheckImplementation() {
		return false;
	}

}

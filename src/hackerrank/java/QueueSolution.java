package hackerrank.java;

import java.util.Scanner;
import java.util.Stack;

public class QueueSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> queue = new MyQueue<Integer>();
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();

	}
	
	public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
        	stackNewestOnTop.push(value);
        	
        }

        public T peek() {
        	if(stackOldestOnTop.empty()) {
        		shiftStack();
        	}
        	return stackOldestOnTop.peek();
        }

        public T dequeue() {
        	if(stackOldestOnTop.empty()) {
        		shiftStack();
        	}
        	return stackOldestOnTop.pop();
        }
        
        void shiftStack(){
        	if(stackOldestOnTop.empty()) {
        		while(!stackNewestOnTop.empty()) {
            		stackOldestOnTop.push(stackNewestOnTop.pop());
            	}
        	}
        	
        }
    }
}

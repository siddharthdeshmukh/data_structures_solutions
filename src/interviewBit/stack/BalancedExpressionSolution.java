package interviewBit.stack;

import java.util.Stack;

public class BalancedExpressionSolution {

	public static void main(String[] args) {
		System.out.println(isValid("[{"));
	}
	
	public static int isValid(String A) {
		Stack<Character> stack = new Stack<>();
		
		char[] charInString = A.toCharArray();
		
		for(char ch : charInString) {
			if(ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			}
			else if(ch == '}' || ch == ')' || ch == ']') {
				if(stack.isEmpty()) {
					return 0;
				}
				else if((stack.peek()=='{' && ch != '}') || (stack.peek()=='(' && ch != ')') || (stack.peek()=='[' && ch != ']')) {
					return 0;
				}else {
					stack.pop();
				}
				
			}
		}
		if(stack.isEmpty()) {
			return 1;
		}
		return 0;
	}
}

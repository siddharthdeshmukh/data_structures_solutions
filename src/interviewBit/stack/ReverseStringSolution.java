package interviewBit.stack;

import java.util.Stack;

public class ReverseStringSolution {
	
	public static void main(String[] args) {
		System.out.println(reverseString("((((([{()}[]]{{{[]}}})))))"));
	}
	
	public static String reverseString(String A) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		char[] charInString = A.toCharArray();
		for(char ch:charInString) {
			stack.push(ch);
		}
		while(stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}

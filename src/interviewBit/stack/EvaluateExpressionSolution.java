package interviewBit.stack;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpressionSolution {

	public static void main(String[] args) {
		
		ArrayList<String> A = new ArrayList<>();
		//A : [ "5", "1", "2", "+", "4", "*", "+", "3", "-" ]
		A.add("5");
		A.add("1");
		A.add("2");
		A.add("+");
		A.add("4");
		A.add("*");
		A.add("+");
		A.add("3");
		A.add("-");
		System.out.println(evalRPN(A));

	}
	
	 public static int evalRPN(ArrayList<String> A) {
		 int result =0;
		 final String operators = "+-*/";
		 Stack<Integer> stack = new Stack<>();
		 
		 for(String stringinList : A) {
			 if(!operators.contains(stringinList)) {
				 stack.push(Integer.parseInt(stringinList));
			 }else {
				 int x = stack.pop();
				 int y = stack.pop();
				 
				 if(stringinList == "+") {
					 stack.push(x+y);
				 }
				 if(stringinList == "-") {
					 stack.push(y-x);
				 }
				 if(stringinList == "*") {
					 stack.push(x*y);
				 }
				 if(stringinList == "/") {
					 stack.push(y/x);
				 }
			 }
		 }
		 
		 return stack.peek();
	    }

}

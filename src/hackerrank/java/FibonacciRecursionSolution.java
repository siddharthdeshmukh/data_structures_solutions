package hackerrank.java;

public class FibonacciRecursionSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(6));

	}
	
	public static int fibonacci(int n) {
        // Complete the function.
     
      if(n==0) {
    	  return 0;
      }
      else if(n==1) {
    	  return 1;
      }else {
    	  return fibonacci(n-1)+ fibonacci(n-2); 
      }
      
    }

}

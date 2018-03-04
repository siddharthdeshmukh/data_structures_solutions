package codility.xtremax;

import java.util.Arrays;

public class SolutionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  A = {-3,-1};
		int count = solution(A);
		System.out.println(count);

	}
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 
		 Arrays.sort(A);
		 int count =1;
		 for(int i=0;i<A.length;i++){
			 if(count == A[i]){
				 count++;
			 }
			 if(count< A[i]){
				 return count;
			 }
		 }
	  return count;   
	 }

}

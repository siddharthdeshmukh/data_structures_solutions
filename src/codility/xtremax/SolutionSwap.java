package codility.xtremax;

import java.util.Arrays;

public class SolutionSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,5,3,3,7};
		boolean swap = solution(A);
		System.out.println(swap);

	}
	 public static boolean solution(int[] A) {
	        // write your code in Java SE 8
		 int swap = 0;
		//check if array is already sorted
		 boolean sorted =true;
		 for(int i=0;i<A.length-1;i++){
			 if(A[i]>A[i+1]){
				 sorted =false;
			 }
		 }
		 if(sorted){
			 return sorted;
		 }
		 int[] copyA = Arrays.copyOf(A, A.length);
		 Arrays.sort(copyA);
		 for(int i=0;i<A.length;i++){
			 if(A[i] != copyA[i]){
				 swap++;
			 }
		 }
		 if(swap>2){
			 return false;
		 }
		 return true;
	    }
	 
	 
}

package interviewBit.array;

import java.util.Arrays;

public class SolutionAddOne {

	public static void main(String[] args){
		int[] A = {1,2,3};
		int[] B = {1,2,9};
		int[] C = {1,3, 9,9};
		
		/*A = plusOne(A);
		B=plusOne(B);*/
		C=plusOne(C);
		
		toString(A,A.length);
		toString(B,B.length);
		toString(C,C.length);
		
	}
	
	public static int[] plusOne(int[] A) {
		boolean allNine = true;
		boolean nintiesNo =true;
		
		int count =0;
		for(int i=0;i<A.length;i++){
			if(A[i]==0){
				count++;
			}else {
				break;
			}
		}
		if(count>0){
			int[] B =Arrays.copyOf(A, A.length);
			A = Arrays.copyOf(A, A.length -count);
			for(int i = 0;i<A.length;i++){
				A[i] = B[i+count];
			}
			
		}
		for(int i=0;i<A.length;i++){
			if(A[i]!=9){
				allNine=false;
				break;
			}
		}
		if(!allNine){
			for(int i=1;i<A.length;i++){
				if(A[i] != 9){
					nintiesNo =false;
				}
			}
			if(nintiesNo){
				A[0] = A[0] +1;
				for(int i=1;i<A.length;i++){
					A[i] =0;
				}
			}else {
				if(A[A.length-1]==9){
					A[A.length-1] = 0;
		        	A[A.length-2] = A[A.length-2] +1;
				}else {
					A[A.length-1] = A[A.length-1] +1;
				}
			}
			
			
		}else {
			A = Arrays.copyOf(A, A.length+1);
			A[0]=1;
			for(int i=1;i<A.length-1;i++){
				A[i]=0;
			}
		}
			
		
        return A;
    }

	
	public static void toString(int[] array, int length) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++){
			System.out.print(array[i]+ " ");
		}
	}
}

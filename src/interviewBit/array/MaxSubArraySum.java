package interviewBit.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>();
		//[-2,1,-3,4,-1,2,1,-5,4]
		A.add(-2);
		A.add(-1);
		A.add(-3);
		A.add(4);
		A.add(-1);
		A.add(2);
		A.add(1);
		A.add(-5);
		A.add(4);
		System.out.println(maxSubArray(A));
	}
	public static int maxSubArray(final List<Integer> A) {
		if(A.size()==0){
			return 0;
		}
		if(A.size()==1){
			return A.get(0);
		}
		int maxSum =A.get(0);
		int maxEndingHere = A.get(0);
		for (int i = 1; i < A.size(); i++) {
			int x = A.get(i);
			maxEndingHere = Math.max(x, maxEndingHere + x);
			maxSum = Math.max(maxSum, maxEndingHere);
		}
		return maxSum;
    }

}

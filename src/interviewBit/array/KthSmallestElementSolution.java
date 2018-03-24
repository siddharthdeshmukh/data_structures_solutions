package interviewBit.array;

import java.util.Collections;
import java.util.List;

public class KthSmallestElementSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int kthsmallest(final List<Integer> A, int B) {
		
		Collections.sort(A);
		
		return A.get(B-1);
    }

}

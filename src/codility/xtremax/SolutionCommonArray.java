package codility.xtremax;

import java.util.Arrays;

public class SolutionCommonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,5,2,3,10,3,2};
		int[] B = {5,3,4,10};
		//int common = solution(A, B);
		//System.out.println(common);
		int[] c= {4,6,9,10};
		int index = solution(c, 10);
		System.out.println(index);
	}
	
	public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
		int common = -1;
		Arrays.sort(A);
		Arrays.sort(B);
		
		int lengthA = A.length;
		int lengthB = B.length;
		
		for(int i= 0;i<lengthA;i++){
			for (int j = 0;j<lengthB;j++){
					if(B[j] == A[i]){
						common = A[i];
						return common;
					}
			}
		}
		return common;
    }
	
	static int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] >= X) {
                r = m ;
            } else {
                l = m+1;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }

}

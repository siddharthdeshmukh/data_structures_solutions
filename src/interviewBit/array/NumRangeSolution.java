package interviewBit.array;

import java.util.ArrayList;

public class NumRangeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int numRange(ArrayList<Integer> A, int B, int C) {
	    int count=0;
	    for(int i=0; i< A.size(); i++){
			int sum =0;
			for(int j = i ; j < A.size(); j++) {
				sum = sum + A.get(j);
				if(sum >= B && sum <=C){
					count++;
				}
				if(sum > C) {
					break;
				}
			}
		}
		 return count;
	 }

}

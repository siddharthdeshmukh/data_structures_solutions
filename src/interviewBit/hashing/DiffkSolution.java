package interviewBit.hashing;

import java.util.ArrayList;
import java.util.List;

public class DiffkSolution {

	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(3);
		intList.add(6);
		intList.add(10);
		intList.add(11);
		diffPossible(intList, 0);
		
	}
	
	public static int diffPossible(final List<Integer> A, int B) {
		
		
	       for(int i=0;i< A.size()-1;i++){
	    	   int numInList = A.get(i);
			int j=i+1;
			while(j<A.size()){
				if(numInList - A.get(j) == B || A.get(j) - numInList ==B){
					return 1;
				}else {
					j++;
				}
			}
	}
		return 0;
    }
}

package interviewBit.array;

import java.util.ArrayList;

public class SolutionInfiniteGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-1);
		A.add(-1);
		A.add(-2);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(1);
		B.add(2);
		System.out.println(coverPoints(A, B));

	}
	
public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minSteps=0;
        int size = A.size();
        if(size ==0 || size==1){
        	return minSteps;
        }
        int next =1;
        for(int i=0;i<size && next<size;i++){
        	int t1 = Math.abs(A.get(i) - A.get(next));
            int t2 = Math.abs(B.get(i) - B.get(next));
            /*if(t1 < t2)
            	minSteps += t1 + (t2 - t1);
            else if(t2 < t1)
            	minSteps += t2 + (t1 - t2);
            else
            	minSteps += t1;*/
           minSteps += Math.max(t1, t2);
            next++;
        }
       //minSteps = minSteps + Math.abs(Math.max((A.get(0)-A.get(A.size()-1)),(B.get(0)- B.get(B.size()-1))));
        return minSteps;
    }

}

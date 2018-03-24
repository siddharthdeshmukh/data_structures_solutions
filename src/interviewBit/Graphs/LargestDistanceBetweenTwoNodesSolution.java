package interviewBit.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestDistanceBetweenTwoNodesSolution {
	static boolean[] visited ;
	static int ans = 0;
	static int node =0;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();    //Adjency 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>();
		A.add(-1);
		A.add(0);
		A.add(0);
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(5);
		System.out.println(solve(A));

	
	}
	
	public static  int solve(ArrayList<Integer> A) {
		
		ArrayList<int[]> arr = new ArrayList<>();
        for (int i = 0; i < A.size(); ++i) {
            arr.add(new int[2]);
        }
        int maxDistance = 0;
        for (int i = A.size() - 1; i > 0; --i) {
            int element = A.get(i);
            int[] parent = arr.get(element);
            int currentLength = arr.get(i)[0] + 1;
            
            parent[1] = Math.max(parent[1], currentLength + parent[0]);
            parent[0] = Math.max(parent[0], currentLength);
            maxDistance = Math.max(maxDistance, parent[1]);
        }
        return maxDistance == 0 ? 0 : maxDistance;
    }

}

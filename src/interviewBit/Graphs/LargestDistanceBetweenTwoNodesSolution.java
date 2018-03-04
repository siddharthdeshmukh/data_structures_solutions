package interviewBit.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestDistanceBetweenTwoNodesSolution {
	static boolean[] visited ;
	static int ans = 0;
	static int node =0;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
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
		
		visited = new boolean[A.size()];
		
		
		for(int i=0;i<A.size();i++) {
			graph.add(i, new ArrayList<>());
		}
		
		for(int i =0;i<A.size();i++) {
			int values = A.get(i);
			if(values !=-1) {
				graph.get(i).add(values);
				graph.get(values).add(i);
			}
		}
		
		Arrays.fill(visited, false);
		DFS(0, 0);
		
		Arrays.fill(visited, false);
        ans = 0;
        DFS(node, 0);
		return ans;
    }
	
	private static void DFS(int root,int d) {
		
		visited[root] =true;
		
		if (d > ans) {
            ans = d;
            node = root;
        }
		for (Integer node : graph.get(root)) {
            if (visited[node] == false) {
                DFS(node, d + 1);
            }
        }
	}

}

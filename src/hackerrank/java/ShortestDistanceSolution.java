package hackerrank.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class ShortestDistanceSolution {
	private static final int WEIGHT =6;
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt()-1;
                int v = scanner.nextInt()-1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
	
public static class Graph {
		private final int V;
		private ArrayList<Integer>[] adj;
        
        public Graph(int size) {
            this.V=size;
            adj = (ArrayList<Integer>[]) new ArrayList[V];
            for (int v = 0; v < V; v++)
    			adj[v] = new ArrayList<Integer>(V);
           
        }

        public void addEdge(int first, int second) {
            adj[first].add(second);
            adj[second].add(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            boolean[] marked = new boolean[V];
    		queue.add(startId);
    		int[] edgeTo = new int[V];
    		Arrays.fill(edgeTo, -1);
    		edgeTo[startId] = 0;
    		while (!queue.isEmpty()) {
    			int v = queue.poll();
    			marked[v] = true;
    			for (int w : adj[v]) {
    				if (!marked[w]) {
    					marked[w] = true;
    					edgeTo[w] = edgeTo[v] +6;
    					
    					queue.add(w);
    				}
    			}
    		}
        	return edgeTo;
        }
    }
}

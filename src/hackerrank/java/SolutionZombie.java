package hackerrank.java;

public class SolutionZombie {
	static int zombieCluster(String[] zombies) {
        int length = zombies.length;
        int[][] zombiCluster = new int[length][length];
        for(int i=0;i<length;i++){
        	for(int j =0;j<length; j++){
        		zombiCluster[i][j] = Integer.parseInt(zombies[i].charAt(j) + "");
        	}
        }
        boolean alreadyVisited[] = new boolean[length];
        boolean visiting[] = new boolean[length];

        int count = 0;
        for (int i = 0; i < length; ++i) {
            if(!alreadyVisited[i]) {
                visiting[i] = true;
                findVisited(zombiCluster, length, alreadyVisited, visiting, i);
                alreadyVisited[i] = true;
                count++;
            }
        }
        return count;
    }

    static void findVisited(int zombies[][], int length, boolean visited[], boolean[] visiting, int s)
    {
        if( !visited[s] ) {
            visiting[s] = true;
            for(int j = s+1; j < length; j++) {
                if(zombies[s][j] == 1 && !visited[j]) {
                    visiting[j] = true;
                    findVisited(zombies, length, visited, visiting, j);
                    visited[j] = true;
                }
            }
        }
    }

    
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] num ={"1100","1110","0110","0001"};
		int count = SolutionZombie.zombieCluster(num);
		System.out.println(count);
		
   
	}
}

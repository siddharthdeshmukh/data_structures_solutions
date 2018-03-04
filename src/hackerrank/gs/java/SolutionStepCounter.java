package hackerrank.gs.java;

public class SolutionStepCounter {
	static long countSteps(int n) {
        long count =0;
        if(n==1){
        	count = 1;
        }else {
        	long[] res = new long[n+1];
    		res[0]=1;
    		res[1]=1;
    		res[2]=2;
    		for(int i=3;i<=n;i++){
    			res[i]= res[i-1] + res[i-2]+ res[i-3];
    		}
    		count= res[n];
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long steps= countSteps(3);
       System.out.println(steps);
	}

}

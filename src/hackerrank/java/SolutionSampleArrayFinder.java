package hackerrank.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SolutionSampleArrayFinder {
	static int[] oddNumbers(int l, int r) {
		int size =0;
		if(l%2==0 && r%2==0){
			size = (r-l)/2;
		}else {
			size = ((r-l)/2)+1;
		}
		 
		int[] oddArray = new int[size];
        int index =0;
       for(int i=l;i<=r;i++){
    	   if(i%2!=0){
    		   oddArray[index]= i;
    		   index++;
    	   }
       }
       
       
       return oddArray;
    }
	
	public static void main(String[] args){
		
	}
}

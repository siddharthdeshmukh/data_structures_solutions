package hackerrank.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SolutionArrayReduction {
	static int reductionCost(int[] num) {
        int cost =0;
        int length = num.length;
        List<Integer> numList = new ArrayList<Integer>();
        for(int i=0;i<num.length;i++){
        	numList.add(num[i]);
        }
        while(length>1){
        	//Arrays.sort(num);
        	Collections.sort(numList);
        	int newElement = numList.get(0) + numList.get(1);
        	cost = cost + newElement;
        	numList.remove(0);
        	numList.remove(0);
        	numList.add(newElement);
        	//int minValue = getMinValue(num);
        	//System.out.println(minValue);
        	length--;
        }
        return cost;
    }
	
	private static int getMinValue(int[] array){
		int minValue = array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]< minValue){
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={1,2,3,4};
		int cost = SolutionArrayReduction.reductionCost(num);
		System.out.println(cost);
		
   
	}
}

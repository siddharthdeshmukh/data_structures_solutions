package interviewBit.array;

import java.util.ArrayList;

public class PrettyPrint {

	public static void main(String[] args){
		int A =4;
		ArrayList<ArrayList<Integer>> prtyList = prettyPrint(A);
		for(ArrayList<Integer> innerList: prtyList){
			for(int num: innerList){
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<Integer>> prettyPrint(int A) {
		int listSize = 2*A -1;
        ArrayList<ArrayList<Integer>> prettyList = new ArrayList(listSize);
        int number =A;
        for(int i=0;i<listSize;i++){
        	ArrayList<Integer> innerlist = new ArrayList<Integer>();
        	for(int j=0;j<listSize;j++){
        		innerlist.add(number);
        	}
        	prettyList.add(innerlist);
        }
        
        return prettyList;
    }
}

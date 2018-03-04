package interviewBit.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionArrayBug {
	
	public  static void  main(String[] args){
		
		int[] A=  { 44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59 };
		int[] c= {5, 10, 2, 1};
		 ArrayList<Integer> Alist = new ArrayList<Integer>();
		 Alist.add(5);
		 Alist.add(10);
		 Alist.add(2);
		 Alist.add(1);
		 /*Alist.add(71);
		 Alist.add(45);
		 Alist.add(28);
		 Alist.add(65);
		 Alist.add(75);
		 Alist.add(93);
		 Alist.add(66);
		 Alist.add(66);
		 Alist.add(37);
		 Alist.add(6);
		 Alist.add(24);
		 Alist.add(59);*/
		/* Alist.add(98);
		 Alist.add(77);
		 Alist.add(35);*/
		ArrayList<Integer> bList= performOps(Alist);
		for(Integer aint : bList){
			System.out.print(aint.intValue() + " ");
		}
	}
	void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
		public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
			ArrayList<Integer> ret = new ArrayList<Integer>();
			
			int newIndex =0;
			if(B> A.size()){
			    newIndex = B% A.size();
			}
				for (int i = 0; i < A.size(); i++) {
				    if(newIndex+i>=A.size())
				       ret.add(A.get(i+newIndex-A.size()));
				    else
					   ret.add(A.get(i + newIndex));
				}
			return ret;
		}
		
		static ArrayList<Integer> performOps(ArrayList<Integer> A) {
	        ArrayList<Integer> B = new ArrayList<Integer>();
	        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
	        for (int i = 0; i < A.size(); i++) {
	                B.set(i, A.get(i));
	                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
	        }
	        return B;
	}
	
}

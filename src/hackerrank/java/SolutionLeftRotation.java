package hackerrank.java;

import java.util.Scanner;

public class SolutionLeftRotation {
	
	private static final Scanner scan = new Scanner(System.in);
	
	private static void leftRotate(int[] a,int d) {
		int n = a.length;
		if(d%n==0) {
        	for(int i=0;i<a.length;i++) {
        		System.out.print(a[i] + " ");
        	}
        	return;
        }
        int rotation =0;
        
        if(d>n){
           rotation = d%n; 
        }else {
        	rotation=d;
        }
        for(int i=0;i<rotation;i++) {
        	
        	for(int j=0;j<a.length-1;j++) {
        		int temp = a[j];
        		a[j]=a[j+1];
        		a[j+1]=temp;
        	}
        }
        for(int i=0;i<a.length;i++) {
    		System.out.print(a[i] + " ");
    		
    	}
	}
	
	

	public static void main(String[] args) {
		int[] a = new int[5];
		int d =4;
		for(int i=0;i<5;i++) {
			a[i]=i+1;
		}
		// TODO Auto-generated method stub
		/*String[] nd = scan.nextLine().split(" ");

        int n = Integer.parseInt(nd[0].trim());

        int d = Integer.parseInt(nd[1].trim());

        

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }*/
        
       // SolutionLeftRotation.leftRotate(a, d);
        SolutionLeftRotation.leftRotateImproved(a, 0, d-1);
        SolutionLeftRotation.leftRotateImproved(a, d, a.length-1);
        SolutionLeftRotation.leftRotateImproved(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	private static void leftRotateImproved(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start++] = a[end];
			a[end--] = temp;

		}

	}
	
	

}

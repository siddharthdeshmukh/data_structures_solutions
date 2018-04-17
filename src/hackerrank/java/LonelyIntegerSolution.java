package hackerrank.java;

public class LonelyIntegerSolution {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0]=1;
		a[1]=1;
		a[2]=2;
		System.out.println(lonelyInteger(a));
	}
	
public static int lonelyInteger(int[] a) {
      int lonely =0;
      for(int i=0;i<a.length;i++) {
    	  lonely = lonely^a[i];
      }
      return lonely;
    }
}

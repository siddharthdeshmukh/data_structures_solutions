package interviewBit.algo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,5,6,7};
		System.out.println(binarySearch(array, 7));
	}
	
	private static int binarySearch(int[] array, int num) {
		return recursiveBinarySearch(array, num, 0, array.length-1);
	}
	
	private static int recursiveBinarySearch(int[] array, int num, int start,int end){

		int mid = start + (end - start) / 2;

		if (num == array[mid]) {
			return mid;
		}
		if (num < array[mid]) {
			end = mid-1;
			return recursiveBinarySearch(array, num, start, end);
		} else {
			start = mid + 1;
			return recursiveBinarySearch(array, num, start, end);
		}
	}

}

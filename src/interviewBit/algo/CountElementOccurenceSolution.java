package interviewBit.algo;

import java.util.List;

public class CountElementOccurenceSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 5, 6, 7, 7, 7, 7};
		System.out.println(findCount(array, 7));
	}
	
	public static int findCount(final int[] array, int B) {
        int count=0;
        if(array.length==0){
            return count;
        }
        if(array.length==1 && array[0]==B){
            return 1;
        }
        int i;
        int j;
        
        i= firstOccurence(array, B, 0, array.length-1);
        if(i==-1){
        	return i;
        }
        j = lastOccurence(array, B, i, array.length-1);
        
        return j-i +1;
    }
	
	private static int firstOccurence(int[] array, int num, int start,int end){
		if(end >= start){
		int mid = (start + end ) / 2;

		if( ( mid == 0 || num > array[mid-1]) && array[mid] == num){
			return mid;
		}else if (num > array[mid]) {
			start = mid + 1;
			return firstOccurence(array, num, start, end);
			
		} else {
			end = mid-1;
			return firstOccurence(array, num, start, end);
		}
		}
		return -1;
	}
	static int lastOccurence(int arr[], int num, int low, int high)
    {
      if(high >= low)
      {
        /*low + (high - low)/2;*/     
        int mid = (low + high)/2; 
        if( ( mid == arr.length-1 || num < arr[mid+1]) && arr[mid] == num )
          return mid;
        else if(num < arr[mid])
          return lastOccurence(arr,num ,low, (mid -1));
        else
          return lastOccurence(arr,num, (mid + 1), high);      
      }
      return -1;
    }

}

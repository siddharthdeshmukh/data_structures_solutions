package sorting;

public class SortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] bubbleSortarr = {10,12,1,3,4,6};
        int[] bubbleSortedArray = bubbleSort(bubbleSortarr);
        System.out.println("----- Bubble Sort------");
        for(int i=0;i< bubbleSortedArray.length;i++){
        	System.out.println(bubbleSortedArray[i]);
        }
        System.out.println("----- Insertion Sort------");
        int[] insertionSortarr = {10,12,1,3,4,6};
        int[] insertionSortedArray = insertionSort(insertionSortarr);
        for(int i=0;i< insertionSortedArray.length;i++){
        	System.out.println(insertionSortedArray[i]);
        }
        System.out.println("----- Merge Sort------");
        int[] mergeSortarr = {10,12,1,3,4,6};
        int[] mergeSortedArray = mergeSort(mergeSortarr);
        for(int i=0;i< mergeSortedArray.length;i++){
        	System.out.println(mergeSortedArray[i]);
        }
		
	}
	
	private static int[] bubbleSort(int[] arr){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]> arr[j+1]){
					int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j] =temp;
				}
			}
		}
		return arr;
	}

	private static int[] insertionSort(int[] arr){
		int length = arr.length;
		for(int i=0;i<length;i++){
			int temp = arr[i];
			int index =i;
			while(index >0 && arr[index-1]>temp){
				arr[index]= arr[index-1];
				index--;
			}
			arr[index] =temp;
		}
		return arr;
	}
	
	private static int[] mergeSort(int[] arr){
		
		int length = arr.length;
		if(length<2){
			return arr;
		}
		int mid = length/2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		for(int i =0;i<mid;i++ ){
			left[i]= arr[i];
		}
		for(int i=mid;i<length;i++){
			right[i-mid]= arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
		return arr;
	}
	private static int[] merge(int[] left, int[] right, int[] arr){
		int leftLength = left.length;
		int rightLength =  right.length;
		int length = arr.length;
		int i=0,j=0,k =0;
		while(i<leftLength && j<rightLength){
			if(left[i]<right[j]){
				arr[k]=left[i];
				i++;
				k++;
			}else if(right[j]<left[i]){
				arr[k]= right[j];
				j++;
				k++;
			}
		}
		while(i<leftLength){
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<rightLength){
			arr[k]= right[j];
			j++;
			k++;
		}
		
		return arr;
	}
}

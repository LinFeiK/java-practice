package sorting;

import java.util.Arrays;

// reference https://www.geeksforgeeks.org/merge-sort/
// sorts lists in nlog(n) time in ascending order
public class MergeSort {
	
	// sorts array[left...right] using merge()
	// if @param order is 'A', sorts in ascending order, otherwise sorts in descending order
	public void mergeSort(int[] array, int left, int right, char order) {
		if (left >= right) return;
		
		// calculate middle
		int middle = (left + right) / 2;
		
		mergeSort(array, left, middle, order);
		mergeSort(array, middle + 1 > right ? right : middle + 1, right, order);
		merge(array, left, middle, right, order);
	}
	
	// merges sub-arrays array[left...middle] and array[middle + 1...right] 
	// if @param order is 'A', sorts in ascending order, otherwise sorts in descending order
	private void merge(int[] array, int left, int middle, int right, char order) {
		int[] leftArray = copySubarray(array, left, middle);
		int[] rightArray = copySubarray(array, middle + 1 > right ? right : middle + 1, right);
		
		int leftArrayIndex = 0; 
		int rightArrayIndex = 0;
		int arrayIndex = left;
		
		// merge the two sub-arrays
		while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
			if (order == 'A' ? leftArray[leftArrayIndex] <= rightArray[rightArrayIndex] :
								leftArray[leftArrayIndex] >= rightArray[rightArrayIndex]) {
				array[arrayIndex] = leftArray[leftArrayIndex];
				leftArrayIndex++;
			} else {
				array[arrayIndex] = rightArray[rightArrayIndex];
				rightArrayIndex++;
			}
			arrayIndex++;
		}
		
		// if any element is remaining in the sub arrays, put them in the array
		while (leftArrayIndex < leftArray.length) {
			array[arrayIndex] = leftArray[leftArrayIndex];
			arrayIndex++;
			leftArrayIndex++;
		}
		
		while (rightArrayIndex < rightArray.length) {
			array[arrayIndex] = rightArray[rightArrayIndex];
			arrayIndex++;
			rightArrayIndex++;
		}
	}
	
	// copies a sub-array into a new array and returns it
	private int[] copySubarray(int[] array, int left, int right) {		
		int[] copy = new int[right - left + 1];
		
		for (int i = left, j = 0; i <= right; i++, j++) {
			copy[j] = array[i];
		}
		
		return copy;
	}

}

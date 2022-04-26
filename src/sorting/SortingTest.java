package sorting;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		int[] test1 = {1, 5, 9, 2, 8, 7};
		int[] test2 = {3, 1};
		int[] test3 = {1};
		int[] test4 = {};
		int[] test5 = {9, 7, 2, 5, 3};
		
		MergeSort mergeSort = new MergeSort();
		
		testMergeSort(mergeSort, test1);
		testMergeSort(mergeSort, test2);
		testMergeSort(mergeSort, test3);
		testMergeSort(mergeSort, test4);
		testMergeSort(mergeSort, test5);
	}
	
	private static void testMergeSort(MergeSort mergeSort, int[] testArray) {
		mergeSort.mergeSort(testArray, 0, testArray.length - 1);
		System.out.println(Arrays.toString(testArray));
	}

}

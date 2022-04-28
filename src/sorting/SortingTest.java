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
		
		testMergeSort(mergeSort, test1, 'A');
		testMergeSort(mergeSort, test2, 'D');
		testMergeSort(mergeSort, test3, 'A');
		testMergeSort(mergeSort, test4, 'A');
		testMergeSort(mergeSort, test5, 'D');
	}
	
	private static void testMergeSort(MergeSort mergeSort, int[] testArray, char order) {
		mergeSort.mergeSort(testArray, 0, testArray.length - 1, order);
		System.out.println(Arrays.toString(testArray));
	}

}

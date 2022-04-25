package sorting;

import java.util.Arrays;

public class SortingTest {

	public static void main(String[] args) {
		int[] test = {1, 5, 9, 2, 8, 7};
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(test, 0, 0, test.length - 1);
		System.out.println(Arrays.toString(test));
	}

}

package io.wkz.sorting.base;

/**
 * @author 王可尊
 * @since 1.0
 */
public interface Sorting {
	/**
	 * sort an array
	 *
	 * @param array array that will be sorted
	 */
	int[] sorting(int[] array);

	/**
	 * swap two element from array
	 *
	 * @param array source array
	 * @param i     position i
	 * @param j     position j
	 */
	default void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}

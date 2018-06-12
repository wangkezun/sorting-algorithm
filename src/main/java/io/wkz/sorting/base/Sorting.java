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
	void sort(int[] array);

	/**
	 * swap two element from array
	 *
	 * @param array source array
	 * @param i     position i
	 * @param j     position j
	 */
	default  void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	static boolean isSorted(int[] array) {
		if (array==null ||array.length==1) {
		    return true;
        }
        for(int i=1;i<array.length;i++) {
		    if(array[i-1]>array[i]) {
		        return false;
            }
        }
        return true;
	}
}

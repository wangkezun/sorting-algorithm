package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 冒泡排序
 *
 * @author 王可尊
 * @since 1.0
 */
public class BubbleSorting implements Sorting {
	@Override
	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}
}

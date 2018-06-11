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
	public int[] sorting(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
		return array;
	}
}

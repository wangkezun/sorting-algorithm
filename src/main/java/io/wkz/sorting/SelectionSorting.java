package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 选择排序的实现
 *
 * @author 王可尊
 * @since 1.0
 */
public class SelectionSorting implements Sorting {
	@Override
	public int[] sorting(int[] array) {
		int min;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			//每次循环寻找最小的索引位置，并与i交换
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
		return array;
	}
}

package io.wkz.sorting.quick;

import io.wkz.sorting.base.Sorting;

/**
 * 快速排序 递归方式实现
 *
 * @author 王可尊
 * @since 1.0
 */
public class RecursiveQuickSorting extends AbstractQuickSorting implements Sorting {

	private static final int CUTOFF = 10;

	@Override
	public void sort(int[] array) {
		recursiveQuickSort(array, 0, array.length - 1);
	}

	/**
	 * 递归的调用
	 *
	 * @param array 要排序的数组
	 * @param left  左索引
	 * @param right 右索引
	 */
	private void recursiveQuickSort(int[] array, int left, int right) {
		//当左索引小于右索引时进入，否则无意义
		if (left < right) {
			//选择枢纽元
			int pivot = median3(array, left, right);
			int i = left, j = right - 1;
			while (true) {
				while (array[++i] < pivot) {
				}
				while (array[--j] > pivot) {
				}
				if (i < j) {
					swap(array, i, j);
				} else {
					break;
				}
			}
			if (i < right) {
				swap(array, i, right - 1);
			}
			recursiveQuickSort(array, left, i - 1);
			recursiveQuickSort(array, i + 1, right);
		}
	}
}

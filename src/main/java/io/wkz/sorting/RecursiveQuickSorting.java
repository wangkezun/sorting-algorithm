package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 快速排序 递归方式实现
 *
 * @author 王可尊
 * @since 1.0
 */
public class RecursiveQuickSorting implements Sorting {

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

	/**
	 * 一个比较好的枢纽元选取方法，获取left center right的中值作为枢纽元
	 *
	 * @param array 选取枢纽元的数组
	 * @param left  最左索引
	 * @param right 最右索引
	 * @return 枢纽元数值
	 */
	private int median3(int[] array, int left, int right) {
		int center = (left + right) / 2;
		//如果左大于右，那么左右交换
		if (array[left] > array[right]) {
			swap(array, left, right);
		}
		//如果左大于中，那么左中交换
		if (array[left] > array[center]) {
			swap(array, left, center);
		}
		//如果中大于右，那么中右交换
		if (array[center] > array[right]) {
			swap(array, center, right);
		}
		//将中交换到right-1处
		swap(array, center, right - 1);
		return array[right - 1];
	}
}

package io.wkz.sorting.quick;

import io.wkz.sorting.base.Sorting;

/**
 * @author 王可尊
 * @since 1.0
 */
abstract class AbstractQuickSorting implements Sorting {
	/**
	 * 一个比较好的枢纽元选取方法，获取left center right的中值作为枢纽元
	 *
	 * @param array 选取枢纽元的数组
	 * @param left  最左索引
	 * @param right 最右索引
	 * @return 枢纽元数值
	 */
	int median3(int[] array, int left, int right) {
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

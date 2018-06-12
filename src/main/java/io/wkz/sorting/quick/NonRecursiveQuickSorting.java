package io.wkz.sorting.quick;

import io.wkz.sorting.base.Sorting;

import java.util.Stack;

/**
 * @author 王可尊
 * @since 1.0
 */
public class NonRecursiveQuickSorting extends AbstractQuickSorting implements Sorting {
	@Override
	public void sort(int[] array) {
		if (array == null || array.length == 1) {
			return;
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(array.length - 1);
		while (!stack.empty()) {
			int right = stack.pop();
			int left = stack.pop();
			if (right <= left) {
				continue;
			}
			int i = nonRecursiveQuickSort(array, left, right);
			if (left < i - 1) {
				stack.push(left);
				stack.push(i - 1);
			}
			if (i + 1 < right) {
				stack.push(i + 1);
				stack.push(right);
			}
		}
	}

	private int nonRecursiveQuickSort(int[] array, int left, int right) {

		int i = left, j = right - 1;
		if (left < right) {
			//选择枢纽元
			int pivot = median3(array, left, right);

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
		}
		return i;
	}
}

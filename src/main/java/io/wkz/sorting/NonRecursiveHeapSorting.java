package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 非递归方式的堆排序
 * 采用一个for循环的方式进行堆化处理
 * @author tyrael
 * @since 1.0
 * @see io.wkz.sorting.RecursiveHeapSorting
 */
public class NonRecursiveHeapSorting implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = array.length / 2; i >= 0; i--) {
            nonRecursiveMaxHeapify(array, i, array.length);
        }
        for (int i = array.length - 1; i > 0; i--) {
            swap(array, 0, i);
            nonRecursiveMaxHeapify(array, 0, i);
        }
    }


    private void nonRecursiveMaxHeapify(int[] array, int index, int length) {
        int child;
        int temp = array[index];
        for (; index * 2 + 1 < length; index = child) {
            child = index * 2 + 1;
            if (child < length-1 && array[child] < array[child + 1]) {
                child++;
            }
            if (temp < array[child]) {
                array[index] = array[child];
            } else {
                break;
            }
        }
        array[index] = temp;
    }
}

package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 希尔排序
 */
public class ShellSorting implements Sorting {
    /**
     * 希尔排序
     *
     * @param array array that will be sorted
     * @return 排序后的数组
     */
    @Override
    public void sort(int[] array) {
        //希尔排序与插入排序的区别在于多了一层gap的选择。其他与插入排序一致
        int i;
        //首先选择步长gap 流行的选取步长的方式为h(1)=N/2以及h(k)=h(k+1)/2 但是不好 此处使用此方法
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //与插入排序不同之处在于起始位置为gap 而不是1 gap是递减的，最终会回到1
            for (int p = gap; p < array.length; p++) {
                int temp = array[p];
                //此处与插入排序不同之处在于减的步长为gap。而不是1
                for (i = p; i >= gap && array[i - gap] > temp; i -= gap) {
                    array[i] = array[i - gap];
                }
                array[i] = temp;
            }
        }
    }
}

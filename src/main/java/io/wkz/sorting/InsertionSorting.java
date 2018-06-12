package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

public class InsertionSorting implements Sorting {
    @Override
    public int[] sorting(int[] array) {
        int i;
        for (int p = 1; p < array.length; p++) {
            //p位置的数
            int temp = array[p];
            // 此循环是用来将所有大于temp的数统统丢到temp后面用的。以此获取temp的位置
            // 注意此处的array[i-1]>temp 而不是array[i]>temp 因为i初始化时就是p此时去判断无意义。直接原样返回了数组。
            for (i = p; i > 0 && array[i - 1] > temp; i--) {
                array[i] = array[i - 1];
            }
            //获取到temp所在位置后，将temp赋值回去。
            array[i] = temp;
        }
        return array;
    }
}

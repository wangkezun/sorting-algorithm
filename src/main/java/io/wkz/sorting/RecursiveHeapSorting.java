package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;

/**
 * 堆排序的实现，先对堆进行
 *
 * @author 王可尊
 * @since 1.0
 */
public class RecursiveHeapSorting implements Sorting {
    @Override
    public int[] sorting(int[] array) {
        //堆排序需要先对数组进行堆化处理
        //从第一个非叶子节点出发即可，叶子节点都可以看作已经符合堆要求的节点

        for (int i = array.length / 2; i >= 0; i--) {
            recursiveMaxHeapify(array, i, array.length);
        }

        //堆化完成之后，从length开始，交换堆顶元素与length位置元素，并且重新堆化，最后到length为0
        for (int i = array.length - 1; i > 0; i--) {
            //交换堆顶元素
            swap(array, 0, i);
            //此时因为堆顶元素可能不符合堆要求，因此需要进行一次堆化
            recursiveMaxHeapify(array, 0, i - 1);
        }

        return array;
    }


    /**
     * 对数组进行堆化处理 递归的方式
     *
     * @param array  数组
     * @param index  需要堆化处理的数据的索引
     * @param length 未堆化的数组长度
     */
    private void recursiveMaxHeapify(int[] array, int index, int length) {
        //左儿子的索引位置
        int leftIndex = (index << 1) + 1;
        //右儿子的索引位置
        int rightIndex = leftIndex + 1;
        int maxIndex = leftIndex;
        //当左儿子索引大于数组长度时，跳出即可
        if (leftIndex > length) {
            return;
        }
        //此时判断右儿子是否存在以及右儿子与左儿子的大小，用于交换索引与最大儿子
        if (rightIndex <= length && array[rightIndex] > array[leftIndex]) {
            maxIndex = rightIndex;
        }
        if (array[maxIndex] > array[index]) {
            swap(array, maxIndex, index);
            recursiveMaxHeapify(array, maxIndex, length);
        }
    }

}

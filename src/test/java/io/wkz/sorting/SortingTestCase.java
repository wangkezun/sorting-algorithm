package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;
import io.wkz.sorting.quick.NonRecursiveQuickSorting;
import io.wkz.sorting.quick.RecursiveQuickSorting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author 王可尊
 * @since 1.0
 */
@DisplayName("排序算法的测试用例")
class SortingTestCase {

    private int[] array;

    @BeforeEach
    void before() {
        array = new int[]{3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};
    }


    @RepeatedTest(100)
    @DisplayName("递归方式堆排序测试用例")
    void recursiveHeapSortingTest() {
        RecursiveHeapSorting recursiveHeapSorting = new RecursiveHeapSorting();
        recursiveHeapSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @RepeatedTest(100)
    @DisplayName("非递归堆排序测试用例")
    void nonRecursiveHeapSortingTest() {
        NonRecursiveHeapSorting nonRecursiveHeapSorting = new NonRecursiveHeapSorting();
        nonRecursiveHeapSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @RepeatedTest(100)
    @DisplayName("冒泡排序测试用例")
    void bubbleSortingTest() {
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }

    @RepeatedTest(100)
    @DisplayName("选择排序测试用例")
    void selectionSortingTest() {
        SelectionSorting selectionSorting = new SelectionSorting();
        selectionSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @RepeatedTest(100)
    @DisplayName("插入排序测试用例")
    void insertionSortingTest() {
        InsertionSorting insertionSorting = new InsertionSorting();
        insertionSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }

    @RepeatedTest(100)
    @DisplayName("希尔排序测试用例")
    void shellSortingTest() {
        ShellSorting shellSorting = new ShellSorting();
        shellSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }



    @RepeatedTest(100)
    @DisplayName("递归快速排序测试用例")
    void recursiveQuickSortingTest(){
        RecursiveQuickSorting recursiveQuickSorting = new RecursiveQuickSorting();
        recursiveQuickSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @RepeatedTest(100)
    @DisplayName("非递归快速排序测试用例")
    void nonRecursiveQuickSortingTest() {
        NonRecursiveQuickSorting nonRecursiveQuickSorting = new NonRecursiveQuickSorting();
        nonRecursiveQuickSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }
}

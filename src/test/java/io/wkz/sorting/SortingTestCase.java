package io.wkz.sorting;

import io.wkz.sorting.base.Sorting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * @author 王可尊
 * @since 1.0
 */
public class SortingTestCase {

    private int[] array;

    @Before
    public void before() {
        array = new int[]{3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};
    }


    @Test
    public void recursiveHeapSortingTest() {
        RecursiveHeapSorting recursiveHeapSorting = new RecursiveHeapSorting();
        recursiveHeapSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @Test
    public void bubbleSortingTest() {
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }

    @Test
    public void selectionSortingTest() {
        SelectionSorting selectionSorting = new SelectionSorting();
        selectionSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @Test
    public void insertionSortingTest() {
        InsertionSorting insertionSorting = new InsertionSorting();
        insertionSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }

    @Test
    public void shellSortingTest() {
        ShellSorting shellSorting = new ShellSorting();
        shellSorting.sort(array);
        assertTrue(Sorting.isSorted(array));

    }

    @Test
    public void nonRecursiveHeapSortingTest() {
        NonRecursiveHeapSorting nonRecursiveHeapSorting = new NonRecursiveHeapSorting();
        nonRecursiveHeapSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @Test
    public void recursiveQuickSortingTest(){
        RecursiveQuickSorting recursiveQuickSorting = new RecursiveQuickSorting();
        recursiveQuickSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @Test
    public void nonRecursiveQuickSortingTest() {
        NonRecursiveQuickSorting nonRecursiveQuickSorting = new NonRecursiveQuickSorting();
        nonRecursiveQuickSorting.sort(array);
        assertTrue(Sorting.isSorted(array));
    }

    @After
    public void after() {
        System.out.println(Arrays.toString(array));
    }
}

package io.wkz.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 王可尊
 * @since 1.0
 */
public class SortingTestCase {

	private int[] array;

	@Before
	public void before(){
		array =  new int[]{3,5,3,0,8,6,1,5,8,6,2,4,9,4,7,0,1,8,9,7,3,1,2,5,9,7,4,0,2,6};
	}


	@Test
	public void heapSortingTest() {
		HeapSorting heapSorting = new HeapSorting();
		heapSorting.sorting(array);
		System.out.println(Arrays.toString(array));
	}

	@Test
	public void bubbleSortingTest() {
		BubbleSorting bubbleSorting = new BubbleSorting();
		bubbleSorting.sorting(array);
		System.out.println(Arrays.toString(array));
	}
}

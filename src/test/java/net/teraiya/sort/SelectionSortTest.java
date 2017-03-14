package net.teraiya.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jteraiya on 3/12/17.
 */
public class SelectionSortTest {
    @Test
    public void sort() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        int[] actuals = selectionSort.sort(new int[]{4, 15, 2, 6, 19, 3, 7, 1, 17});
        Assert.assertArrayEquals(new int[]{1,2,3,4,6,7, 15, 17,19}, actuals);
    }

    @Test
    public void selectionSort() throws Exception {
        SelectionSort selectionSort = new SelectionSort();
        int[] actuals = selectionSort.selectionSort(new int[]{4, 15, 2, 6, 19, 3, 7, 1, 17});
        Assert.assertArrayEquals(new int[]{1,2,3,4,6,7, 15, 17,19}, actuals);
    }

}
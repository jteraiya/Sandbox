package net.teraiya;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @org.junit.Test
    public void testMergeSortedArray() throws Exception {
        int[] arr1 = {1, 3,4, 5, 7, 9, 10};
        int[] arr2 = {2, 4, 6, 8};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        System.out.println(Arrays.toString(mergeSortedArray.mergeSortedArray(arr1, arr2)));

    }
}
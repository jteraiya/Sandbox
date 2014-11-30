package net.teraiya;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testFindUsingBinarySearch() throws Exception {
        BinarySearch bs = new BinarySearch();
        int[] binarArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = bs.findUsingBinarySearch(binarArray, 0, 9, 4);
        assertEquals(3, index);
    }
}
package net.teraiya.sort;

import org.junit.Test;
import java.util.Arrays;

/**
 * Created by jteraiya on 3/7/17.
 */
public class BubbleSortTest {
    @Test
    public void bubbleSortArr() throws Exception {
        BubbleSort bs = new BubbleSort();
        int[] sortArr = bs.bubbleSortArr(new int[]{3, 7, 1, 5, 12, 2, 6});
        System.out.println(Arrays.toString(sortArr));
    }

}
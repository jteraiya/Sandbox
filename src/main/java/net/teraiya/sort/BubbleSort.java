package net.teraiya.sort;

/**
 * Created by jteraiya on 3/7/17.
 */
public class BubbleSort {

    int[] bubbleSortArr(int[] unsorted) {
        int temp;
        for(int i=0; i<unsorted.length-1; i++){
            for(int j=i+1; j<unsorted.length; j++){
                if (unsorted[i] > unsorted[j]){
                    temp = unsorted[i];
                    unsorted[i]=unsorted[j];
                    unsorted[j]= temp;
                }
            }
        }
        return unsorted;
    }
}

package net.teraiya.sort;

/**
 * Created by jteraiya on 3/12/17.
 */
public class SelectionSort {

    int [] selectionSort(int[] arr){
        int [] sortedArr = arr;
        int temp;
        for (int i=0; i<sortedArr.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<sortedArr.length; j++){
                if(sortedArr[j] < sortedArr[minIndex]){
                    temp = sortedArr[i];
                    sortedArr[i]=sortedArr[j];
                    sortedArr[j]=temp;
                }
            }
        }
        return sortedArr;
    }


    public int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = tmp;
        }
        return data;
    }


}

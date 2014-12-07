package net.teraiya;

/**
 * Created by jteraiya on 11/30/14.
 */
public class MergeSortedArray {


     int[] mergeSortedArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int k=0, j=0, i=0;
         while(i<arr1.length && j<arr2.length){
             if(arr1[i]<arr2[j]){
                 result[k++] = arr1[i++];
             } else {
                 result[k++] = arr2[j++];
             }
         }
         //if there are any remaining elements in arr1, add it to results
         while(i<arr1.length){
             result[k++] = arr1[i++];
         }
         //if there are any remaining elements in arr2, add it to results
         while(j<arr2.length){
             result [k++] = arr2[j++];
         }
        return result;
    }
}

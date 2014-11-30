package net.teraiya;


/**
 * We are using divide and conquer method (http://en.wikipedia.org/wiki/Divide_and_conquer_algorithms)
 * Created by jteraiya on 11/30/14.
 */
public class BinarySearch {

     int findUsingBinarySearch(int[] binArr, int minIndex, int maxIndex, int numToLocate) {
        // -1 indicates element not found
        int index = -1, midPoint;
        if (binArr.length > 0) {
            midPoint = (minIndex + maxIndex) / 2;

            if (numToLocate < binArr[midPoint]) {
                //Recursive call
                index = findUsingBinarySearch(binArr, minIndex, midPoint-1, numToLocate);
            } else if (numToLocate > binArr[midPoint]) {
                //Recursive call
                index = findUsingBinarySearch(binArr, midPoint+1, maxIndex, numToLocate);
                //Recursion base case
            } else {
                index = midPoint;
            }
        }
        return index;
    }
}

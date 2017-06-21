
package test;

import java.util.Arrays;

/**
 *
 * @author saurya
 */
public class MedianCalculator {

    public MedianCalculator() {

    }

    //Calculate the median 
    //Return type is double to handle the median value with decimal
    public static double calculateMedian(int[] data) {
        //Sort the array
        Arrays.sort(data);
        
        //array size
        int dataSize = data.length;
        
        //mid position of the data
        int midPos = getMidPosition(dataSize);
        
        //if the array has even number of elements it needs to calculate median in a different way
        if (dataSize % 2 == 0) {
            return (double) (data[midPos - 1] + data[midPos]) / 2;
        } else {
            //if the array has odd number of elements just return the element from the middle position
            return data[midPos - 1];
        }
    }

    //calculate the mid position of the data
    private static int getMidPosition(int size) {
        return (size + 1) / 2;
    }

}

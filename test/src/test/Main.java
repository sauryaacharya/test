
package test;

/**
 *
 * @author saurya
 */
public class Main {

    
    public static void main(String[] args) {
        String testString = "abcdefghijk";
        int [] data = {0, 1, 5, 2, 4, 3, 6};
        System.out.println("The reverse is: " + StringUtil.reverseString(testString));
        System.out.println("The shuffled string is: " + StringUtil.shuffleString(testString));
        System.out.println("The median is: " + MedianCalculator.calculateMedian(data));
    }
    
}

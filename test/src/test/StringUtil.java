
package test;

import java.util.Random;

/**
 *
 * @author saurya
 */
public class StringUtil {
    
    public StringUtil(){
    
    }
    
    //Reverse the string
    public static String reverseString(String s){
        //return empty if there is no string
        if(s.length() == 0 || s.equals(" "))
            return "";
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }
    
    //Shuffle the string randomly
    public static String shuffleString(String s){
        //convert the input string to char array
        char [] strArr = s.toCharArray();
        
        //create a random object to generate random numbers
        Random random = new Random();
        
        //loop through the char array
        for(int i = 0; i < strArr.length; i++){
            //generate the random integer number 
            int nextRandom = i + random.nextInt(strArr.length - i);
            
            //swap the current char with having the index of char equal to nextRandom
            swap(strArr, i, nextRandom);
        }
        return String.valueOf(strArr);
    }
    
    //Swap the element of array
    private static void swap(char [] strArr, int currentIndex, int nextIndex){
        //temp variable to store current element
        char temp = strArr[currentIndex];
        
        //assig the next element to the current element index
        strArr[currentIndex] = strArr[nextIndex];
        
        //assign the current element to next element index
        strArr[nextIndex] = temp;
    }
}

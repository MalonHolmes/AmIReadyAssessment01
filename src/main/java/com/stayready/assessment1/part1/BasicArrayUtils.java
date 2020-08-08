package com.stayready.assessment1.part1;


/**
 * This one was a breeezzeeeee
 * 
 * I hope the other ones are as easy
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] result = new String[stringArray.length];
        int idx = result.length - 1;
        for (String string : stringArray) {
            result[idx] = string;
            idx--;
        }
        return result;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String result = "";
        for (String string : stringArray) {
            result += string.charAt(0);
        }
        return result;
    }
}

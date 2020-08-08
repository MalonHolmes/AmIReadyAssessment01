package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer result = 0;
        for (Integer integer : intArray) {
            result += integer;
        }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer result = 1;
        for (Integer integer : intArray) {
            result *= integer;
        }
        return result;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        return (double) getSum(intArray) / intArray.length;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer max = intArray[0];
        for(int idx = 1; idx < intArray.length; idx++){
            max = Math.max(max, intArray[idx]);
        }
        return max;
    }
}
